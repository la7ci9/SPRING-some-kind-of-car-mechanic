package com.learn.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.learn.entity.Car;
import com.learn.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	private CarService carService;

	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping("/add")
	public String takeNewWork(Model model) {
		Car car = new Car();
		//car.setBroughtIn(LocalDate.now().toString());
		model.addAttribute("newcar", car);
		return "new_work";
	}
	
	@PostMapping("/home")
	public String saveCar(@ModelAttribute("newcar") Car car) {
		car.setBroughtIn(LocalDate.now().toString());
		carService.saveCar(car);
		return "redirect:/home";
	}

}
