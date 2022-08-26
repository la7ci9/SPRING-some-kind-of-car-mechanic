package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

	@GetMapping("employee/add")
	public String createNewStudent(Model model) {
		Employee emp = new Employee();
		model.addAttribute("employee",emp);
		return "new_employee";
	}
	
	@PostMapping("employees")
	public String saveEmployee(@ModelAttribute("employee") Employee emp) {
		employeeService.saveEmployee(emp);
		return "redirect:employees";
	}
}
