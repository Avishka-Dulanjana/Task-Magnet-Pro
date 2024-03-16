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
  const [feedback, setFeedback] = useState("");
  const [name, setName] = useState("");
  const { enqueueSnackbar } = useSnackbar();

  const handleFeedbackChange = (e) => {
    setFeedback(e.target.value);
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
        feedback: feedback,
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
          {task.taskName}
        </Typography>
        <IconButton onClick={onClose} sx={{ position: "absolute", right: 0, top: 0 }}>
          <CloseIcon />
        </IconButton>
      </DialogTitle>
      <DialogContent dividers>
        <DialogContentText>
          <Typography variant="body1" gutterBottom>
            <strong>Description:</strong> {task.desc}
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Submission Date:</strong> {task.submissionDate}
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Status:</strong>{" "}
            <span style={{ color: task.isTaskComplete ? "#4CAF50" : task.isTaskStart ? "#FFC107" : "#FF9800" }}>
              {task.isTaskComplete ? "Completed" : task.isTaskStart ? "In Progress" : "Paused"}
            </span>
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Employee Name:</strong> {name}
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Time Spend:</strong> {formatTime(task.spendTime)}
          </Typography>
          <Typography variant="body1" gutterBottom>
            <strong>Additional Info:</strong> {task.additionalInfo || "-"}
          </Typography>
          {task.submittedFiles && (
            <Typography variant="body1" gutterBottom>
              <strong>Submitted Files:</strong>{" "}
              <Link target="_blank" to={task.submittedFiles}>See Submitted Files</Link>
            </Typography>
          )}
          {task.feedback && (
            <Typography variant="body1" gutterBottom>
              <strong>Feedback:</strong> {task.feedback}
            </Typography>
          )}
        </DialogContentText>
        {task.submitted && task.feedback == null && (
          <TextField
            label="Feedback"
            fullWidth
            multiline
            rows={4}
            variant="outlined"
            value={feedback}
            onChange={handleFeedbackChange}
            sx={{ mt: 2 }}
          />
        )}
      </DialogContent>
      {task.submitted && task.feedback == null && (
        <DialogActions>
          <Button onClick={onClose}>Close</Button>
          <Button
            variant="contained"
            disabled={!task.isTaskComplete}
            onClick={() => {
              submitFeedback(feedback);
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
