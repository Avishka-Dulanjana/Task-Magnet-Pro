import React from "react";
import { Link, useNavigate } from "react-router-dom";

const EmployerHeader = () => {
  const navigate = useNavigate();

  const logout = () => {
    localStorage.setItem("role", undefined);
    localStorage.clear();
    navigate("/");
  };

  return (
    <nav className="bg-blue-700 shadow-md">
      <div className="container mx-auto px-4">
        <div className="flex justify-between items-center py-4">
          <div className="flex items-center">
            <Link
              to="/dashboard-employer"
              className="text-white text-lg font-bold uppercase tracking-wider"
            >
              Task Magnet Pro
            </Link>
          </div>
<<<<<<< HEAD
          <div
            className={"lg:flex flex-grow items-center flex"}
            id="example-navbar-danger"
          >
            <ul className="flex flex-col lg:flex-row list-none lg:ml-auto">
              <li className="nav-item">
                <Link
                  className="px-3 py-2 flex items-center text-xs uppercase font-bold leading-snug text-white hover:opacity-75"
                  to="/create-task"
                >
                  <span className="ml-2 text-base">Create Task</span>
                </Link>
              </li>
              <li className="nav-item">
                <Link
                  className="px-3 py-2 flex items-center text-xs uppercase font-bold leading-snug text-white hover:opacity-75"
                  to="/employees"
                >
                  <span className="ml-2 text-base">Employees</span>
                </Link>
              </li>
              <li className="nav-item">
                <Link
                  className="px-3 py-2 flex items-center text-xs uppercase font-bold leading-snug text-white hover:opacity-75"
                  to="/all-tasks"
                >
                  <span className="ml-2 text-base">All Tasks</span>
                </Link>
              </li>
              <li className="nav-item">
                <Link
                    className="px-3 py-2 flex items-center text-xs uppercase font-bold leading-snug text-white hover:opacity-75"
                    to="/report"
                >
                  <span className="ml-2 text-base">Report</span>
                </Link>
              </li>
              <li className="nav-item">
                <button onClick={()=>logout()}
                  className="px-3 py-2 flex items-center text-xs uppercase font-bold leading-snug text-white hover:opacity-75"
                >
                  <span className="ml-2 text-base">Log out</span>
                </button>
              </li>
            </ul>
=======
          <div className="flex items-center space-x-6">
            <NavLink to="/create-task">Create Task</NavLink>
            <NavLink to="/employees">Employees</NavLink>
            <NavLink to="/all-tasks">All Tasks</NavLink>
            <button
              onClick={logout}
              className="text-white font-bold uppercase hover:opacity-75"
            >
              Log out
            </button>
>>>>>>> 2bdf1128ec0d41b521549ba790cd422c70831566
          </div>
        </div>
      </div>
    </nav>
  );
};

const NavLink = ({ to, children }) => {
  return (
    <Link
      to={to}
      className="text-white hover:opacity-75 transition duration-300 ease-in-out"
    >
      {children}
    </Link>
  );
};

export default EmployerHeader;
