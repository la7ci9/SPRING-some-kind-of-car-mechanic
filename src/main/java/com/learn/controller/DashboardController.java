package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	@GetMapping("/home")
	public String homeDashboard() {
		return "home_dash";
	}
	
	@GetMapping("/allwork")
	public String seeAllWork() {
		return "all_work";
	}
	
	@GetMapping("/add")
	public String takeNewWork() {
		return "new_work";
	}
	
	@GetMapping("/employees")
	public String employeesPage() {
		return "employees";
	}
	
	@GetMapping("/mechanic")
	public String logMechanic() {
		return "mechanic_dash";
	}
}
