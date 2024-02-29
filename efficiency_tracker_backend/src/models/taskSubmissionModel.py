class TaskSubmission:
    def __init__(self, taskId,employeeId,submissionTime = None, submissionDate = None,isSubmitted = False, submittedFiles = None):
        self.taskId = taskId
        self.employeeId = employeeId
        self.submissionTime = submissionTime
        self.submissionDate = submissionDate
        self.isSubmitted = isSubmitted
        self.submittedFiles = submittedFiles