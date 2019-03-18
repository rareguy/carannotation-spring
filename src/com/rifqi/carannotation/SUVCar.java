package com.rifqi.carannotation;

public class SUVCar implements Car {
	
	private DestinationService destinationService;
	
	public void getDailyFuelIntake() {
		System.out.println("100 litre");
	}
	
	public SUVCar() {
		
	}

	public SUVCar(DestinationService destinationService) {
		this.destinationService = destinationService;
	}

	public DestinationService getDestinationService() {
		return destinationService;
	}

	public void setDestinationService(DestinationService destinationService) {
		this.destinationService = destinationService;
	}

	@Override
	public String toString() {
		return "SUVCar [destinationService=" + destinationService + "]";
	}
	
	
}
