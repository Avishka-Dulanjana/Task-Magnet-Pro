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
    { id: 'task', label: 'Task Name', minWidth: 170 },
    {id: 'estimationDate', label: 'Estimation Date', minWidth: 170},
    {id: 'submittedDate', label: 'Submitted Date', minWidth: 170},
    {id: 'spendTime', label: 'Spend Time', minWidth: 170},
    {id: 'efficiency', label: 'Efficiency', minWidth: 170},
];

function createData(id,name, task, estimationDate,submittedDate, spendTime,efficiency) {
    // const density = population / size;
    return { id,name, task, estimationDate,submittedDate, spendTime,efficiency };
}

const rows = [
    createData('C0001', 'Nimal', "task One", "2024-04-16","2024-04-20","13:13",'75%'),
    createData('C0002', 'Kamal', "task Two", "2024-04-16","2024-04-20","10:10",'80%'),
    createData('C0003', 'Amaya', "task Three", "2024-04-16","2024-04-20","09:12",'75%'),
    createData('C0004', 'Bihara', "task Four", "2024-04-16","2024-04-20","08:12",'55%'),
    createData('C0005', 'Methmini', "task Five", "2024-04-16","2024-04-20","08:14",'70%'),
    createData('C0006', 'Chanali', "task Six", "2024-04-16","2024-04-20","12:30",'89%'),
    createData('C0007', 'Dinithi', "task Seven", "2024-04-16","2024-04-20","10:15",'65%'),
    createData('C0008', 'Sanduni', "task Eight", "2024-04-16","2024-04-20","13:45",'59%'),
    createData('C0009', 'Prageeth', "task Nine", "2024-04-16","2024-04-20","14:14",'67%'),
    createData('C00010', 'Tharindu', "task Ten", "2024-04-16","2024-04-20","13:12",'81%'),
    createData('C00011', 'Kaveesha', "task Eleven", "2024-04-16","2024-04-20","14:12",'52%'),
    createData('C00012', 'Akash', "task Twelve", "2024-04-16","2024-04-20","12:15",'95%'),
];

const Report = () => {

    const [employees, setEmployees] = useState([])
    useEffect(() => {
        axios
            .get(`${baseURL}/report`)
            .then((res) => res.data && setEmployees(res.data))
            .catch((err) => console.log(err));
    }, []);

    const [page, setPage] = React.useState(0);
    const [rowsPerPage, setRowsPerPage] = React.useState(10);

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
                            {rows
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
                    count={rows.length}
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
