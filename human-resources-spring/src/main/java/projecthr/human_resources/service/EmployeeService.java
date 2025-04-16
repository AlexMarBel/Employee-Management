package projecthr.human_resources.service;

import projecthr.human_resources.models.Employee;
import projecthr.human_resources.models.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee findEmployeeById(Integer idEmployee);

    public void saveEmployee(EmployeeDto dto, Integer idEmployee);

    public void deleteEmployee(Integer idEmployee);

}
