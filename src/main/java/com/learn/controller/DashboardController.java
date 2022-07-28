package com.learn.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learn.entity.Car;
import com.learn.service.CarService;

@Controller
public class DashboardController {
	
	private CarService carService;
	
	public DashboardController(CarService carService) {
		this.carService = carService;
	}
	
	List<Car> carsSorted; 

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
		model.addAttribute("cars", carsSorted = carService.getAllCar().stream().sorted(Comparator.comparing(Car::getBroughtIn)).toList());
		//EZ ROSSZ, ÁTNÉZNI A STREAM-ET
		return "mechanic_dash";
	}
}
