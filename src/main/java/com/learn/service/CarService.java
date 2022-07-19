package com.learn.service;

import java.util.List;

import com.learn.entity.Car;
import com.learn.repository.CarRepository;

public class CarService implements CarServiceDAO {
	
	private CarRepository carRepository;
	
	public CarService(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@Override
	public List<Car> getAllCar() {
		return carRepository.findAll();
	}

	@Override
	public Car saveCar(Car car) {
		return carRepository.save(car);
	}

	@Override
	public Car getCarById(Long id) {
		return carRepository.findById(id).get();
	}

	@Override
	public Car updateCar(Car car) {
		return saveCar(car);
	}

	@Override
	public void deleteCar(Long id) {
		carRepository.deleteById(id);
	}

}
