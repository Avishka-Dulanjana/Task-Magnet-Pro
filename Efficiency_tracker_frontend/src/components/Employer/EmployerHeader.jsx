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
              Efficiency Tracker
            </Link>
          </div>
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
