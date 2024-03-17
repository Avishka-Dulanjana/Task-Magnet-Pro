class Task:
    def __init__(self, userId,employerId,taskMonitorId, taskSubmissionId,taskName, description, attachment=None, isTaskComplete=False, isTaskStart=False, isPause=False, lastStartTime = None, additionalInfo=None, feedBack=None, createdDate = None,estimateDate = None, createdBy = None):
        self.userId = userId
        self.employerId = employerId
        self.taskMonitorId = taskMonitorId
        self.taskSubmissionId = taskSubmissionId
        self.taskName = taskName
        self.description = description
        self.attachment = attachment
        self.isTaskComplete = isTaskComplete
        self.isTaskStart = isTaskStart
        self.isPause = isPause
        self.lastStartTime = lastStartTime
        self.additionalInfo = additionalInfo
        self.feedBack = feedBack
        self.createdDate = createdDate
        self.estimateDate = estimateDate
        self.createdBy = createdBy
