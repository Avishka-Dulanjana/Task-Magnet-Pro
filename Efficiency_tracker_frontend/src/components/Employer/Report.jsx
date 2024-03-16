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
    {id: 'estimationTime', label: 'Estimation Time', minWidth: 170},
    {id: 'spendTime', label: 'Spend Time', minWidth: 170},
    {id: 'efficiency', label: 'Efficiency', minWidth: 170},
];

function createData(id,name, task, estimationTime, spendTime,efficiency) {
    // const density = population / size;
    return { id,name, task, estimationTime, spendTime,efficiency };
}

const rows = [
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
    createData('215g23fgg5sd4g', 'Nimal', "task One", "12:12:12","11:11:11",'75%'),
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
            <PageHeader title={"Report"} />

            <Paper sx={{ width: '100%', overflow: 'hidden' }}>
                <TableContainer sx={{ maxHeight: 440 }}>
                    <Table stickyHeader aria-label="sticky table">
                        <TableHead>
                            <TableRow>
                                {columns.map((column) => (
                                    <TableCell
                                        key={column.id}
                                        align={column.align}
                                        style={{ minWidth: column.minWidth }}
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
