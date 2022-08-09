package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learn.entity.Employee;
import com.learn.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public String employeesPage(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployee());
		return "employees";
	}

	@GetMapping("/employees/add")
	public String createNewStudent(Model model) {
		Employee emp = new Employee();
		model.addAttribute("employee",emp);
		return "new_employee";
	}
}
