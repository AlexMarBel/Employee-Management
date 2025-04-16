package projecthr.human_resources.models;

public class EmployeeDto {

    private Integer idEmployee;
    private String name;
    private String department;
    private Double salary;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer idEmployee, String name, String department, Double salary) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
