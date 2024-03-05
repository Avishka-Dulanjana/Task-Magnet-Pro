import json
import os
from datetime import datetime

from bson.objectid import ObjectId
from flask import Blueprint, request

from config import db
from src.models.taskModel import Task
from src.controllers.userController import find_all

taskCtrl = Blueprint('task', __name__)

# create task
@taskCtrl.route('/create', methods=['POST'])
def create_task():
    data = request.json

    task = Task(data["userId"], data["taskName"], data["desc"],
                data["submissionDate"], data["attachment"])

    result = db.tasks.insert_one(task.__dict__)

    return json.dumps({'taskId': result.inserted_id}, default=str)

# view all task based on employee
@taskCtrl.route('/', methods=['GET'])
def find_all():
    cursor = db.tasks.find()
    result = [document for document in cursor]
    return json.dumps(result, default=str)

# View relevant task when click 
@taskCtrl.route('/find_by_id', methods=['GET'])
def find_by_id():
    data = request.args.get('id')

    result = db.tasks.find_one({'_id':  ObjectId(data)})

    return json.dumps(result, default=str)