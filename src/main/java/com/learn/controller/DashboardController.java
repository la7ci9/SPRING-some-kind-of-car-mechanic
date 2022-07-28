package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learn.service.CarService;

@Controller
public class DashboardController {
	
	private CarService carService;
	
	public DashboardController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping("/home")
	public String homeDashboard() {
		return "home_dash";
	}
	
	@GetMapping("/allwork")
	public String seeAllWork() {
		return "all_work";
	}
	
	@GetMapping("/mechanic")
	public String logMechanic(Model model) {
		model.addAttribute("cars", carService.getAllCar());
		return "mechanic_dash";
	}
}
