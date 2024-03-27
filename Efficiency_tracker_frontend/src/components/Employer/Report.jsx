import axios from "axios";
import React, { useEffect, useState } from "react";
import { baseURL } from "../../apiURL";
import PageHeader from "../PageHeader";
import Paper from '@mui/material/Paper';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TablePagination from '@mui/material/TablePagination';
import TableRow from '@mui/material/TableRow';

const columns = [
    { id: 'id', label: 'Employee Id', minWidth: 170 },
    { id: 'name', label: 'Employee Name', minWidth: 170 },
    { id: 'assignedTaskCount', label: 'Assigned Task Count', minWidth: 170 },
    {id: 'completedTaskCount', label: 'Completed Task Count', minWidth: 170},
    {id: 'spendTime', label: 'Spend Time(h)', minWidth: 170},
    {id: 'taskEfficiency', label: 'Task Efficiency(%)', minWidth: 170},
    {id: 'employeeEfficiency', label: 'Employee Efficiency(%)', minWidth: 170},
];

function createData(id,name, assignedTaskCount, completedTaskCount,spendTime, taskEfficiency,employeeEfficiency) {
    return { id,name, assignedTaskCount, completedTaskCount,spendTime, taskEfficiency,employeeEfficiency };
}

const Report = () => {

    const [page, setPage] = React.useState(0);
    const [rowsPerPage, setRowsPerPage] = React.useState(10);
    const [report, setReport] = React.useState([]);

    useEffect(() => {
        getReport();
    }, []);

    const getReport = async () => {
        await axios
          .get(`${baseURL}/task/report`)
          .then((res) => res.data && setReport(res.data))
          .catch((err) => console.log(err));
    };

    const handleChangePage = (event, newPage) => {
        setPage(newPage);
    };

    const handleChangeRowsPerPage = (event) => {
        setRowsPerPage(+event.target.value);
        setPage(0);
    };

    return (
        <>
            <PageHeader title={"Efficiency Report"} />

            <Paper sx={{ width: '100%', overflow: 'hidden' }}>
                <TableContainer sx={{ maxHeight: 440 }}>
                    <Table stickyHeader aria-label="sticky table">
                        <TableHead>
                            <TableRow>
                                {columns.map((column) => (
                                    <TableCell
                                        key={column.id}
                                        align={column.align}
                                        style={{ minWidth: column.minWidth, backgroundColor:"lightskyblue",fontWeight:"bold",fontFamily:"cursive" }}
                                    >
                                        {column.label}
                                    </TableCell>
                                ))}
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {report
                                .slice(page * rowsPerPage, page * rowsPerPage + rowsPerPage)
                                .map((row) => {
                                    return (
                                        <TableRow hover role="checkbox" tabIndex={-1} key={row.code}>
                                            {columns.map((column) => {
                                                const value = row[column.id];
                                                return (
                                                    <TableCell key={column.id} align={column.align}>
                                                        {column.format && typeof value === 'number'
                                                            ? column.format(value)
                                                            : value}
                                                    </TableCell>
                                                );
                                            })}
                                        </TableRow>
                                    );
                                })}
                        </TableBody>
                    </Table>
                </TableContainer>
                <TablePagination
                    rowsPerPageOptions={[10, 25, 100]}
                    component="div"
                    count={report.length}
                    rowsPerPage={rowsPerPage}
                    page={page}
                    onPageChange={handleChangePage}
                    onRowsPerPageChange={handleChangeRowsPerPage}
                />
            </Paper>
        </>
    );
};

export default Report;
