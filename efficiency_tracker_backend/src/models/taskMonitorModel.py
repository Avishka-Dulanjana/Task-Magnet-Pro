class TaskMonitor:
    def __init__(self, userId,taskId,assignedDate = None, startDate = None,startTime = None, endDate = None, endTime=None, spendTime = None):
        self.userId = userId
        self.taskId = taskId
        self.assignedDate = assignedDate
        self.startDate = startDate
        self.startTime = startTime
        self.endDate = endDate
        self.endTime = endTime
        self.spendTime = spendTime