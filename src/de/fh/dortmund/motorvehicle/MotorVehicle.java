package de.fh.dortmund.motorvehicle;

import de.fh.dortmund.rentOffice.RentalOffice;

public class MotorVehicle {
	
	private RentalOffice rentalOffice;

	public MotorVehicle() {
		System.out.println("Motor Vehicles");
	}

	public RentalOffice getRentalOffice() {
		return rentalOffice;
	}

	public void setRentalOffice(RentalOffice rentalOffice) {
		this.rentalOffice = rentalOffice;
	}
	
	

}
