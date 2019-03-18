package com.rifqi.carannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SedanCar implements Car {
	
	@Autowired
	@Qualifier("ponorogoDestinationService")
	private DestinationService destinationService;
	
	private String brand;
	private String type;
	
	public SedanCar(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public SedanCar(DestinationService destinationService) {
		this.destinationService = destinationService;
	}

	public SedanCar() {
		
	}

	@Override
	public String toString() {
		return "SedanCar [destinationService=" + destinationService + ", brand=" + brand + ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DestinationService getDestinationService() {
		return destinationService;
	}
	
	
	public void setDestinationService(DestinationService destinationService) {
		this.destinationService = destinationService;
	}

	@Override
	public void getDailyFuelIntake() {
		System.out.print("120 litre");
	}

}
