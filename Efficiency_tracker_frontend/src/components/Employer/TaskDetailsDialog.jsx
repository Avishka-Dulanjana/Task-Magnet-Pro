import { useEffect, useState } from "react";
import {
  Dialog,
  DialogTitle,
  DialogContent,
  DialogContentText,
  DialogActions,
  Button,
  TextField,
  IconButton,
  Typography,
} from "@mui/material";
import CloseIcon from "@mui/icons-material/Close";
import axios from "axios";
import { baseURL } from "../../apiURL";
import { useSnackbar } from "notistack";
import { Link } from "react-router-dom";

const TaskDetailsDialog = ({ open, onClose, task }) => {
  const [feedBack, setFeedBack] = useState("");
  const [name, setName] = useState("");
  const { enqueueSnackbar } = useSnackbar();

  const handleFeedbackChange = (e) => {
    setFeedBack(e.target.value);
  };

  const getUser = async () => {
    try {
      const response = await axios.get(`${baseURL}/user/find`, {
        params: { user: task.userId },
      });
      setName(response.data.username);
    } catch (error) {
      console.log(error);
    }
  };

  const submitFeedback = async () => {
    try {
      await axios.put(`${baseURL}/task/update_feedback`, {
        id: task._id,
        feedBack: feedBack,
      });
      enqueueSnackbar("Feedback submitted.", {
        variant: "success",
      });
      onClose();
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getUser();
  }, []);

  const formatTime = (time) => {
    const hours = Math.floor(time / 3600).toString().padStart(2, "0");
    const minutes = Math.floor((time % 3600) / 60).toString().padStart(2, "0");
    const seconds = Math.floor(time % 60).toString().padStart(2, "0");
    return `${hours}:${minutes}:${seconds}`;
  };

  return (
    <Dialog open={open} onClose={onClose} maxWidth="md" fullWidth>
      <DialogTitle>
        <Typography variant="h5" component="div" sx={{ flexGrow: 1 }}>
          {task.task.taskName}
        </Typography>
        <IconButton onClick={onClose} sx={{ position: "absolute", right: 0, top: 0 }}>
          <CloseIcon />
        </IconButton>
      </DialogTitle>
      <DialogContent dividers>
        <DialogContentText>
          <Typography variant="body1" gutterBottom>
            <strong>Description:</strong> {task.task.description}
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Submission Date:</strong> {task.task_submission.submissionDate}
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Status:</strong>{" "}
            <span style={{ color: task.task.isTaskComplete ? "#4CAF50" : task.task.isTaskStart ? "#FFC107" : "#FF9800" }}>
              {task.task.isTaskComplete ? "Completed" : task.task.isTaskStart ? "In Progress" : "Paused"}
            </span>
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Employee Name:</strong> {name}
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Time Spend:</strong> {formatTime(task.task_monitor.spendTime)}
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Additional Info:</strong> {task.task.additionalInfo || "-"}
          </Typography>
          {task.task_submission.submittedFiles && (
            <Typography variant="body1" gutterBottom>
              <strong>Submitted Files:</strong>{" "}
              <Link target="_blank" to={task.task_submission.submittedFiles}>See Submitted Files</Link>
            </Typography>
          )}
          {task.task.feedBack && (
            <Typography variant="body1" gutterBottom>
              <strong>FeedBack:</strong> {task.task.feedBack}
            </Typography>
          )}
        </DialogContentText>
        {task.task_submission.isSubmitted && task.task.feedBack == null && (
          <TextField
            label="FeedBack"
            fullWidth
            multiline
            rows={4}
            variant="outlined"
            value={feedBack}
            onChange={handleFeedbackChange}
            sx={{ mt: 2 }}
          />
        )}
      </DialogContent>
      {task.task_submission.isSubmitted && task.task.feedBack == null && (
        <DialogActions>
          <Button onClick={onClose}>Close</Button>
          <Button
            variant="contained"
            disabled={!task.task.isTaskComplete}
            onClick={() => {
              submitFeedback(feedBack);
            }}
          >
            Submit Feedback
          </Button>
        </DialogActions>
      )}
    </Dialog>
  );
};

export default TaskDetailsDialog;
