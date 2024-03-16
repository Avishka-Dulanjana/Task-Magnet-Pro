import axios from "axios";
import React, { useEffect, useState } from "react";
import { baseURL } from "../../apiURL";
import PageHeader from "../PageHeader";
import TaskDetailsDialog from "./TaskDetailsDialog";

const AllTasks = () => {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    getAllTasks();
  }, []);

  const getAllTasks = async () => {
    await axios
      .get(`${baseURL}/task`)
      .then((res) => res.data && setTasks(res.data))
      .catch((err) => console.log(err));
  };

  return (
    <>
      <PageHeader title={"All Tasks"} />
      <div className="grid grid-cols-1 gap-6 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-3 m-4">
        {tasks.map((task) => (
          <Task task={task} getAllTasks={getAllTasks} />
        ))}
      </div>
    </>
  );
};

export default AllTasks;

const Task = ({ task,getAllTasks }) => {

  const [open, setOpen] = useState(false);
  const [name, setName] = useState('');

  useEffect(()=>{
    const getEmployeeName = async (id) => {
      try {
        const response = await axios.get(`${baseURL}/user/find?user=${id}`);
        if (response.data) {
          setName(response.data.username);

        }
      } catch (error) {
        console.log(error);
      }
    };
  },[task.userId])


  return (
    <>
      <div
        key={task.task._id}
        className="p-4 bg-gray-200 rounded-lg shadow-lg"
        onClick={() => setOpen(true)}
      >
        <div className="flex justify-between items-center mb-4">
          <div className="flex items-center">
            <img
              src={`https://picsum.photos/id/1/150`}
              alt={'name'}
              className="w-16 h-216 rounded-full mr-2 me-2"
            />
            <span className="text-xl font-bold">{name}</span>
          </div>
          <div className="flex items-center gap-">
            <span className="text-base font-semibold">
              {"Estimation Date : "}
            </span>
            <span className="text-sm font-bold">{task.task.estimateDate}</span>
          </div>
          <div className="flex items-center gap-2">
            <span className="text-base font-semibold">
              {"Submission Date : "}
            </span>
            <span className="text-sm font-bold">{task.task_monitor.endDate}</span>
          </div>
        </div>
        <div className="mb-4">
          <div className="flex items-center gap-2">
            <span className="text-base font-semibold">{"Task Name : "}</span>
            <span className="text-xl font-bold">{task.task.taskName}</span>
          </div>
          <div className="flex items-center gap-2">
            <p className="text-sm text-gray-600 font-bold">{task.task.description}</p>
          </div>
        </div>
      </div>

      {open && (
        <TaskDetailsDialog
          open={open}
          onClose={() => (setOpen(false), getAllTasks())}
          task={task}
        />
      )}
    </>
  );
};
