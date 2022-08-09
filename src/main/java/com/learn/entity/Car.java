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
	private String carModel;
	private String plate;
	private String status;
	private String problemDescription;
	private String mechanicName;
	private String broughtIn;
	
	public Car() {
		//empty constructor
	}
	
	public Car(String carBrand, String carModel, String plate, String status, String broughtIn) {
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.plate = plate;
		this.status = status;
		this.broughtIn = broughtIn;
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

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
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

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public String getMechanicName() {
		return mechanicName;
	}

	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
	}

	public String getBroughtIn() {
		return broughtIn;
	}

	public void setBroughtIn(String broughtIn) {
		this.broughtIn = broughtIn;
	}
	
}
