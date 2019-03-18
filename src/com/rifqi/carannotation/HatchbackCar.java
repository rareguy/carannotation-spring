package com.rifqi.carannotation;

public class HatchbackCar implements Car {
	
	private DestinationService destinationService;
	private String brand;
	private String type;
		
	public HatchbackCar(DestinationService destinationService) {
		this.destinationService = destinationService;
	}

	public HatchbackCar() {
		
	}

	public DestinationService getDestinationService() {
		return destinationService;
	}


	public void setDestinationService(DestinationService destinationService) {
		this.destinationService = destinationService;
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

	@Override
	public void getDailyFuelIntake() {
		System.out.println("75 litre");

	}

	@Override
	public String toString() {
		return "HatchbackCar [destinationService=" + destinationService + ", brand=" + brand + ", type=" + type + "]";
	}
	
}
