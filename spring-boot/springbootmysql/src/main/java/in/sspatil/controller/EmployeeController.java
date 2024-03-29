package in.sspatil.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sspatil.model.Employee;
import in.sspatil.service.EmployeeService;


@RestController
public class EmployeeController {

@Autowired	
EmployeeService employeeService;	
	
	@PostMapping(path="/SaveEmployee")
	public void saveEmployee(@RequestBody Employee e)
	{
			employeeService.saveEmployee(e);
	}
	
	@GetMapping(path="/getAllEmployee")
	public List<Employee> getAllEmployee()
	{		
		return employeeService.getAllEmployee();		
	}
	
}
