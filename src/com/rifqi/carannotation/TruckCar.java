package com.rifqi.carannotation;

public class TruckCar implements Car {
	
	private DestinationService destinationService;
	
	public TruckCar(DestinationService destinationService) {
		this.destinationService = destinationService;
	}
	
	

	public TruckCar() {
	}



	public DestinationService getDestinationService() {
		return destinationService;
	}

	public void setDestinationService(DestinationService destinationService) {
		this.destinationService = destinationService;
	}

	@Override
	public void getDailyFuelIntake() {
		System.out.println("150 litre");
	}

	@Override
	public String toString() {
		return "TruckCar [destinationService=" + destinationService + "]";
	}

}
