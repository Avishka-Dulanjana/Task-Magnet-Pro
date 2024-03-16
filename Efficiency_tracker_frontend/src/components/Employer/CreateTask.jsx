// import {
//   Button,
//   TextField,
//   Typography,
//   Select,
//   MenuItem,
//   FormControl,
//   InputLabel,
// } from "@mui/material";
// import axios from "axios";
// import { useSnackbar } from "notistack";
// import { useEffect, useState } from "react";
// import { baseURL } from "../../apiURL";
// import PageHeader from "../PageHeader";

// const CreateTask = () => {
//   const [employee, setEmployee] = useState("");
//   const [taskName, setTaskName] = useState("");
//   const [desc, setDesc] = useState("");
//   const [attachment, setAttachment] = useState("");
//   const [dueDate, setDueDate] = useState("");
//   const { enqueueSnackbar } = useSnackbar();
//   const [employeeList, setEmployeeList] = useState([]);

//   useEffect(() => {
//     axios
//       .get(`${baseURL}/user`)
//       .then((res) => res.data && setEmployeeList(res.data))
//       .catch((err) => console.log(err));
//   }, []);

//   const createTask = () => {
//     const data = {
//       userId: employee,
//       taskName,
//       desc,
//       submissionDate: dueDate,
//       attachment: attachment,
//     };

//     axios
//       .post(`${baseURL}/task/create`, data)
//       .then((res) => {
//         if (res.status === 200) {
//           enqueueSnackbar("Task Created.", {
//             variant: "success",
//           });
//           resetForm();
//         } else {
//           enqueueSnackbar("Task Creation Failed.", {
//             variant: "error",
//           });
//         }
//       })
//       .catch((err) =>
//         enqueueSnackbar("Task Creation Failed with" + err, {
//           variant: "error",
//         })
//       );
//   };

//   const resetForm = () => {
//     setEmployee("");
//     setTaskName("");
//     setDesc("");
//     setAttachment("");
//     setDueDate("");
//   };

//   return (
//     <div className="flex flex-col min-h-screen">
//       <PageHeader title={"Create Task"} />
//       <div className="flex-1 overflow-y-auto max-w-lg mx-auto mt-8">
//         <FormControl fullWidth sx={{ marginBottom: 2 }}>
//           <InputLabel id="employee-label">Employee</InputLabel>
//           <Select
//             labelId="employee-label"
//             id="employee"
//             value={employee}
//             onChange={(e) => setEmployee(e.target.value)}
//             label="Employee"
//           >
//             <MenuItem value="" disabled>
//               Select an employee
//             </MenuItem>
//             {employeeList.map((val) => (
//               <MenuItem key={val._id} value={val._id}>
//                 {val.username}
//               </MenuItem>
//             ))}
//           </Select>
//         </FormControl>
//         <TextField
//           fullWidth
//           id="taskName"
//           label="Task Name"
//           variant="outlined"
//           value={taskName}
//           onChange={(e) => setTaskName(e.target.value)}
//           sx={{ marginBottom: 2 }}
//         />
//         <TextField
//           fullWidth
//           id="desc"
//           label="Task Description"
//           multiline
//           rows={4}
//           variant="outlined"
//           value={desc}
//           onChange={(e) => setDesc(e.target.value)}
//           sx={{ marginBottom: 2 }}
//         />
//         <TextField
//           fullWidth
//           id="attachment"
//           label="Attachment"
//           variant="outlined"
//           value={attachment}
//           onChange={(e) => setAttachment(e.target.value)}
//           placeholder="Upload your files to a cloud storage and paste the link here"
//           sx={{ marginBottom: 2 }}
//         />
//         <TextField
//           fullWidth
//           id="dueDate"
//           label=""
//           type="date"
//           variant="outlined"
//           value={dueDate}
//           onChange={(e) => setDueDate(e.target.value)}
//           sx={{ marginBottom: 2 }}
//         />
//         <Button
//           variant="contained"
//           onClick={() => createTask()}
//           sx={{ float: "right", }}
//         >
//           Create Task
//         </Button>
//       </div>
//     </div>
//   );
// };

// export default CreateTask;

import {
  Button,
  TextField,
  Typography,
  Select,
  MenuItem,
  FormControl,
  InputLabel,
} from "@mui/material";
import axios from "axios";
import { useSnackbar } from "notistack";
import { useEffect, useState } from "react";
import { baseURL } from "../../apiURL";
import PageHeader from "../PageHeader";

const CreateTask = () => {
  const [employee, setEmployee] = useState("");
  const [taskName, setTaskName] = useState("");
  const [desc, setDesc] = useState("");
  const [attachment, setAttachment] = useState("");
  const [dueDate, setDueDate] = useState("");
  const { enqueueSnackbar } = useSnackbar();
  const [employeeList, setEmployeeList] = useState([]);

  useEffect(() => {
    axios
      .get(`${baseURL}/user`)
      .then((res) => res.data && setEmployeeList(res.data))
      .catch((err) => console.log(err));
  }, []);

  const createTask = () => {
    const data = {
      userId: employee,
      taskName,
      desc,
      submissionDate: dueDate,
      attachment: attachment,
    };

    axios
      .post(`${baseURL}/task/create`, data)
      .then((res) => {
        if (res.status === 200) {
          enqueueSnackbar("Task Created.", {
            variant: "success",
          });
          resetForm();
        } else {
          enqueueSnackbar("Task Creation Failed.", {
            variant: "error",
          });
        }
      })
      .catch((err) =>
        enqueueSnackbar("Task Creation Failed with" + err, {
          variant: "error",
        })
      );
  };

  const resetForm = () => {
    setEmployee("");
    setTaskName("");
    setDesc("");
    setAttachment("");
    setDueDate("");
  };

  return (
    <div className="flex flex-col min-h-screen">
      <PageHeader title={"Create Task"} />
      <div className="flex-1 overflow-y-auto max-w-lg mx-auto mt-8 space-y-4">
        <FormControl fullWidth sx={{ marginTop: 2 }}>
          <InputLabel id="employee-label">Employee</InputLabel>
          <Select
            labelId="employee-label"
            id="employee"
            value={employee}
            onChange={(e) => setEmployee(e.target.value)}
            label="Employee"
          >
            <MenuItem value="" disabled>
              Select an employee
            </MenuItem>
            {employeeList.map((val) => (
              <MenuItem key={val._id} value={val._id}>
                {val.username}
              </MenuItem>
            ))}
          </Select>
        </FormControl>
        <TextField
          fullWidth
          id="taskName"
          label="Task Name"
          variant="outlined"
          value={taskName}
          onChange={(e) => setTaskName(e.target.value)}
        />
        <TextField
          fullWidth
          id="desc"
          label="Task Description"
          multiline
          rows={4}
          variant="outlined"
          value={desc}
          onChange={(e) => setDesc(e.target.value)}
        />
        <TextField
          fullWidth
          id="attachment"
          label="Attachment"
          variant="outlined"
          value={attachment}
          onChange={(e) => setAttachment(e.target.value)}
          placeholder="Upload your files to a cloud storage and paste the link here"
        />
        <TextField
          fullWidth
          id="dueDate"
          label=""
          type="date"
          variant="outlined"
          value={dueDate}
          onChange={(e) => setDueDate(e.target.value)}
        />
        <Button
          variant="contained"
          onClick={() => createTask()}
          sx={{ float: "right", marginBottom: 4 }}
        >
          Create Task
        </Button>
      </div>
    </div>
  );
};

export default CreateTask;
