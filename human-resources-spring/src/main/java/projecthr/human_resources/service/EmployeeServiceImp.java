package projecthr.human_resources.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projecthr.human_resources.models.Employee;
import projecthr.human_resources.models.EmployeeDto;
import projecthr.human_resources.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(Integer idEmployee) {
        return employeeRepository.findById(idEmployee).orElse(null);
    }

    @Override
    public void saveEmployee(EmployeeDto dto, Integer id) {
        Employee employee;

        if(id == null){
            employee = new Employee();
        }else {
            employee = this.employeeRepository.findById(id).orElse(null);
        }

        employee.setName(dto.getName());
        employee.setDepartment(dto.getDepartment());
        employee.setSalary(dto.getSalary());

        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer idEmployee) {
        employeeRepository.deleteById(idEmployee);
    }
}
