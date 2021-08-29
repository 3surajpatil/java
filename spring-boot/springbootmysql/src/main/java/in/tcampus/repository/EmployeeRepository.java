package in.tcampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.tcampus.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
