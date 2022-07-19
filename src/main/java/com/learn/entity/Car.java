package com.learn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String carBrand;
	private String carModell;
	private String plate;
	private String status;
	
	public Car() {
		//empty consturctor
	}
	
	public Car(String carBrand, String carModell, String plate, String status) {
		this.carBrand = carBrand;
		this.carModell = carModell;
		this.plate = plate;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModell() {
		return carModell;
	}

	public void setCarModell(String carModell) {
		this.carModell = carModell;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
