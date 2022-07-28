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
	
	@GetMapping("/mechanic")
	public String logMechanic() {
		return "mechanic_dash";
	}
}
