package projecthr.human_resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projecthr.human_resources.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
