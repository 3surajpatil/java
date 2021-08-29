package in.tcampus.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import in.tcampus.model.Employee;
import in.tcampus.repository.EmployeeRepository;

@Component
public class EmployeeService {

@Autowired	
EmployeeRepository empRepository;	
	
	
	public Employee saveEmployee(Employee e) {			
		return empRepository.save(e);				
	}
	
	public List<Employee> getAllEmployee()
	{
	
		return empRepository.findAll();
	}
	
}
