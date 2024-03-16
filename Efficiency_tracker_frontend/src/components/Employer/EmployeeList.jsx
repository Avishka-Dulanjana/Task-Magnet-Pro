import { Card, CardContent, CardMedia, Typography } from "@mui/material";
import axios from "axios";
import React, { useEffect, useState } from "react";
import { baseURL } from "../../apiURL";
import PageHeader from "../PageHeader";
import Footer from "../Footer";

const EmployeeList = () => {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    axios
      .get(`${baseURL}/user`)
      .then((res) => res.data && setEmployees(res.data))
      .catch((err) => console.log(err));
  }, []);

  return (
    <>
      <PageHeader title={"Employee List"} />

      <div
        className="flex flex-wrap justify-center"
        style={{ marginBottom: "6rem" }} // Added margin to create space for footer
      >
        {employees.map((employee) => (
          <div
            key={employee.id}
            className="max-w-sm w-full sm:w-1/2 lg:w-1/3 py-4 px-8"
          >
            <Card style={{ width: "100%", height: "100%" }}>
              <CardMedia
                component="img"
                height="200"
                image={`https://randomuser.me/api/portraits/men/${
                  Math.floor(Math.random() * 100) + 1
                }.jpg`}
                alt={`${employee.username}`}
              />
              <CardContent>
                <Typography variant="h5" component="div" gutterBottom>
                  {employee.username}
                </Typography>
                <Typography variant="body2" color="text.secondary">
                  {employee.email}
                </Typography>
              </CardContent>
            </Card>
          </div>
        ))}
      </div>
    </>
  );
};

export default EmployeeList;
