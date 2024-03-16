import React from "react";
import EmployerHeader from "./EmployerHeader";
import Footer from "../Footer";

const EmployerDashboard = ({ children }) => {
  return (
    <div className="flex flex-col min-h-screen">
      <EmployerHeader />
      <main className="flex-1 overflow-y-auto">{children}</main>
      <Footer />
    </div>
  );
};

export default EmployerDashboard;
