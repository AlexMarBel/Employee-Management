import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { NumericFormat } from 'react-number-format';
import { Link } from 'react-router-dom';

export default function EmployeeList() {

    const urlBase = "http://localhost:8080/hr-app/employee"

    const [employees, setEmployees] = useState([]);

    const deleteEmployee = async (id) => {
        await axios.delete(`${urlBase}/${id}`);
        loadEmployees();
    }

    useEffect(() => {
        loadEmployees();
    }, []);

    const loadEmployees = async () => {
        const result = await axios.get(urlBase);
        setEmployees(result.data);
        console.log(result.data);
    }

    return (
        <div className="container">
            <div className="container text-center" style={{ margin: "30px" }}>
                <h3>Human Resources System</h3>
            </div>

            <table className="table table-striped tabler-hover align-middle">
                <thead className="table-dark">
                    <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Name</th>
                        <th scope="col">Department</th>
                        <th scope="col">Salary</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    {
                        employees.map((employee, index) => (
                            <tr key={index}>
                                <th scope="row">{employee.idEmployee}</th>
                                <td>{employee.name}</td>
                                <td>{employee.department}</td>
                                <td><NumericFormat value={employee.salary}
                                    displayType={'text'}
                                    decimalSeparator=','
                                    thousandSeparator='.' suffix={'€'}
                                    decimalScale={2} fixedDecimalScale />
                                </td>
                                <td className='text-center'>
                                    <div>
                                        <Link to={`/edit/${employee.idEmployee}`}
                                        className='btn btn-warning btn-sm me-3'>Edit</Link>
                                        <button onClick={() => deleteEmployee(employee.idEmployee)}
                                        className='btn btn-danger btn-sm'>Delete</button>
                                    </div>
                                </td>
                                      
                        </tr>
                ))
                    }
            </tbody>
        </table>
        </div >
    )
}
