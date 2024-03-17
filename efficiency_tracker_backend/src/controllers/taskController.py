import json
import os
from flask import jsonify

from datetime import datetime

from bson.objectid import ObjectId
# from bson import ObjectId
from flask import Blueprint, request

from config import db
from src.models.taskModel import Task
from src.models.taskMonitorModel import TaskMonitor
from src.models.taskSubmissionModel import TaskSubmission
from src.models.userModel import User
from src.controllers.userController import find_all

taskCtrl = Blueprint('task', __name__)

# create task
@taskCtrl.route('/create', methods=['POST'])
def create_task():
    data = request.json

    task = Task(data["userId"],data["employerId"],None,None, data["taskName"], data["description"],data["attachment"],False,False,False,
                 None, None,None,data["createdDate"],data["estimateDate"],data["createdBy"])

    taskResult = db.tasks.insert_one(task.__dict__)

    taskMonitor = TaskMonitor(data["userId"],taskResult.inserted_id,data["createdDate"],None,None,None,None,0)

    monitorResult = db.taskMonitor.insert_one(taskMonitor.__dict__)

    taskSubmission = TaskSubmission(taskResult.inserted_id,data["userId"],None,None,False,None)

    submissionResult = db.taskSubmission.insert_one(taskSubmission.__dict__)

    db.tasks.update_one({'_id': taskResult.inserted_id}, {
        '$set': {'taskMonitorId': monitorResult.inserted_id, 'taskSubmissionId': submissionResult.inserted_id}})

    return json.dumps({'taskId': taskResult.inserted_id}, default=str)

@taskCtrl.route('/delete_task', methods=['DELETE'])
def delete_task():
    task_id = request.args.get('taskId')

    taskResult = db.tasks.delete_one({'_id':  ObjectId(task_id)})
   
    if taskResult.deleted_count == 1:
        return json.dumps({'taskId': task_id}, default=str)
    else:
        return jsonify({'message': 'Task not found or deletion failed'})

@taskCtrl.route('/taskMonitor', methods=['GET'])
def find_all_Monitors():
    task_id = request.args.get('taskId')
    result =  db.taskMonitor.find_one({"taskId": ObjectId(task_id)})
    return json.dumps(result, default=str)

@taskCtrl.route('/taskSubmission', methods=['GET'])
def find_all_Submission():
    task_id = request.args.get('taskId')
    result =  db.taskSubmission.find_one({"taskId": ObjectId(task_id)})
    return json.dumps(result, default=str)

# view all tasks
@taskCtrl.route('/', methods=['GET'])
def find_all():
    # cursor = db.tasks.find()
    # result = [document for document in cursor]
    # return json.dumps(result, default=str)

    tasks_cursor = db.tasks.find()
    tasks = [task for task in tasks_cursor]

    # Convert ObjectId to string for each task
    for task in tasks:
        task["_id"] = str(task["_id"])

    # Fetch corresponding task monitor data for each task
    task_monitor_data = {}
    for task in tasks:
        task_monitor = db.taskMonitor.find_one({"taskId": ObjectId(task["_id"])})
        task_monitor_data[task["_id"]] = task_monitor
    
    # Fetch corresponding task submission data for each task
    task_submission_data = {}
    for task in tasks:
        task_submission = db.taskSubmission.find_one({"taskId": ObjectId(task["_id"])})
        task_submission_data[task["_id"]] = task_submission
    
    # Combine all data into a single dictionary
    combined_data = []
    for task in tasks:
        task_id = task["_id"]
        combined_data.append({
            "task": task,
            "task_monitor": task_monitor_data.get(task_id),
            "task_submission": task_submission_data.get(task_id)
        })

    return json.dumps(combined_data, default=str)

# View relevant task when click 
@taskCtrl.route('/find_by_id', methods=['GET'])
def find_by_id():
    data = request.args.get('id')
    
    tasks_cursor = db.tasks.find_one({'_id': ObjectId(data)})

    # Fetch corresponding task monitor data for each task
    if tasks_cursor:
        # Fetch corresponding task monitor data for the task
        task_monitor = db.taskMonitor.find_one({"taskId": ObjectId(tasks_cursor["_id"])})
        
        # Fetch corresponding task submission data for the task
        task_submission = db.taskSubmission.find_one({"taskId": ObjectId(tasks_cursor["_id"])})

        result = {
            "task": tasks_cursor,
            "task_monitor": task_monitor,
            "task_submission": task_submission
        }

        return json.dumps(result, default=str)
    else:
        return json.dumps(message="Task not found"), 404

# search tasks by user
@taskCtrl.route('/find_by_user', methods=['GET'])
def find_by_user():
    data = request.args.get('user')

    cursor = db.tasks.find({'userId': data})
    result = [document for document in cursor]
    env_var = os.environ.get('UPLOAD_FOLDER')

    # Add env_var key-value pair to each document in the result array
    for document in result:
        document['path_to_file'] = env_var

    task_monitor_data = {}
    for task in result:
        task_monitor = db.taskMonitor.find_one({"taskId": ObjectId(task["_id"])})
        task_monitor_data[task["_id"]] = task_monitor
        
    # Fetch corresponding task submission data for each task
    task_submission_data = {}
    for task in result:
        task_submission = db.taskSubmission.find_one({"taskId": ObjectId(task["_id"])})
        task_submission_data[task["_id"]] = task_submission

    combined_data = []
    for task in result:
        task_id = task["_id"]
        combined_data.append({
            "task": task,
            "task_monitor": task_monitor_data.get(task_id),
            "task_submission": task_submission_data.get(task_id)
        })

    return json.dumps(combined_data, default=str)

# update feedback
@taskCtrl.route('/update_feedback', methods=['PUT'])
def update_feedback():
    data = request.get_json()
    task_id = data['id']
    feedBack = data['feedBack']

    result = db.tasks.update_one({'_id': ObjectId(task_id)}, {
                                 '$set': {'feedBack': feedBack}})

    return json.dumps({'acknowledged': result.acknowledged}, default=str)

@taskCtrl.route('/find_by_status', methods=['GET'])
def find_by_status():
    data = request.args.get('user')

    tasks_cursor = db.tasks.find({'userId': data})
    tasks = [task for task in tasks_cursor]

    # Fetch corresponding task monitor data for each task
    task_monitor_data = {}
    for task in tasks:
        task_monitor = db.taskMonitor.find_one({"taskId": ObjectId(task["_id"])})
        task_monitor_data[task["_id"]] = task_monitor

    # Fetch corresponding task submission data for each task
    task_submission_data = {}
    for task in tasks:
        task_submission = db.taskSubmission.find_one({"taskId": ObjectId(task["_id"])})
        task_submission_data[task["_id"]] = task_submission

    # Filter tasks where isSubmitted is true and isTaskComplete is true
    user_tasks = []
    for task in tasks:
        task_id = task["_id"]
        user_tasks.append({
                "task": task,
                "task_monitor": task_monitor_data.get(task_id),
                "task_submission": task_submission_data.get(task_id)
            })

    return json.dumps(user_tasks, default=str)

@taskCtrl.route('/start', methods=['POST'])
def start_task():
    data = request.json

    result = db.taskMonitor.update_one({'_id': ObjectId(data['id'])}, {
        '$set': {'startTime': data['startTime']}})
    
    db.tasks.update_one({'_id': ObjectId(data['id'])}, {
        '$set': {'isTaskStart': True, 'lastStartTime': data['startTime']}})

    return json.dumps({'acknowledged': result.acknowledged}, default=str)

@taskCtrl.route('/start_pause', methods=['POST'])
def start_pause_task():
    data = request.json

    result = db.tasks.update_one({'_id': ObjectId(data['id'])}, {
        '$set': {'lastStartTime': data['startTime'], 'isPause': False}})

    return json.dumps({'acknowledged': result.acknowledged}, default=str)

@taskCtrl.route('/pause', methods=['POST'])
def pause_task():
    data = request.json
    
    doc = db.tasks.find_one({'_id': ObjectId(data["id"])})
    lTime = db.taskMonitor.find_one({'taskId': ObjectId(data["id"])})

    startTime = datetime.strptime(doc['lastStartTime'], "%Y-%m-%d %H:%M:%S")
    pauseTime = datetime.strptime(data['pauseTime'], "%Y-%m-%d %H:%M:%S")

    time_diff = ((pauseTime - startTime).total_seconds()) + \
        lTime['spendTime']

    result = db.taskMonitor.update_one({'_id': ObjectId(data['id'])}, {
        '$set': {'spendTime': time_diff}})
    
    db.tasks.update_one({'_id': ObjectId(data['id'])}, {
        '$set': {'isPause': True}})

    return json.dumps({'acknowledged': result.acknowledged}, default=str)

@taskCtrl.route('/end', methods=['POST'])
def end_task():
    data = request.json

    doc = db.tasks.find_one({'_id': ObjectId(data["id"])})
    lTime = db.taskMonitor.find_one({'taskId': ObjectId(data["id"])})

    startTime = datetime.strptime(doc['lastStartTime'], "%Y-%m-%d %H:%M:%S")
    endTime = datetime.strptime(data['endTime'], "%Y-%m-%d %H:%M:%S")

    time_diff = ((endTime - startTime).total_seconds()) + \
        lTime['spendTime']

    db.tasks.update_one({'_id': ObjectId(data['id'])}, {
        '$set': {'isPause': False, 'isTaskStart': False, 'isTaskComplete': True}})
    
    result = db.taskMonitor.update_one({'_id': ObjectId(data['id'])}, {
        '$set': {'spendTime': time_diff, 'endTime': endTime}})

    return json.dumps({'acknowledged': result.acknowledged}, default=str)

# update additional info
@taskCtrl.route('/additional_info', methods=['PUT'])
def additional_info():
    data = request.get_json()
    task_id = data['id']
    info = data['info']
    submittedFiles = data['submittedFiles']
    
    result = db.tasks.update_one({'_id': ObjectId(task_id)}, {
                                 '$set': {'additionalInfo': info,}})
    
    db.taskSubmission.update_one({'_id': ObjectId(task_id)}, {
                                 '$set': {'submittedFiles': submittedFiles, 'isSubmitted': True}})

    return json.dumps({'acknowledged': result.acknowledged}, default=str)

