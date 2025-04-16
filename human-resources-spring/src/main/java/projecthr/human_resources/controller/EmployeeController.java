package projecthr.human_resources.controller;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projecthr.human_resources.models.Employee;
import projecthr.human_resources.models.EmployeeDto;
import projecthr.human_resources.service.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/hr-app")
@CrossOrigin(value = "http://localhost:3000")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    ModelMapper mapper;

    @RequestMapping(path = "/employee", method = RequestMethod.GET)
    public List<EmployeeDto> getAllEmployees(@PathVariable(name = "id", required = false)Integer id){
        List<Employee> employeeList = employeeService.getAllEmployees();
        return employeeList.stream().map(e -> mapper.map(e, EmployeeDto.class)).collect(Collectors.toList());
    }

    @RequestMapping(path = {"/employee", "/employee/{id}"}, method = RequestMethod.PUT)
    public void addEmployee(@PathVariable(name = "id", required = false) Integer id, @RequestBody EmployeeDto dto){
        employeeService.saveEmployee(dto, id);
    }

    @RequestMapping(path = "/employee/{id}", method = RequestMethod.GET)
    public EmployeeDto getEmployeeById(@PathVariable Integer id){
        Employee employee = employeeService.findEmployeeById(id);
        return mapper.map(employee, EmployeeDto.class);
    }

    @RequestMapping(path = "/employee/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("id") Integer id) throws Exception {
        this.employeeService.deleteEmployee(id);
    }
}
