package com.learn.service;

import java.util.List;
import com.learn.entity.Car;

public interface CarServiceDAO {
	
	List<Car> getAllCar();
	
	Car saveCar(Car car);
	
	Car getCarById(Long id);
	
	Car updateCar(Car car);

	void deleteCar(Long id);
}
