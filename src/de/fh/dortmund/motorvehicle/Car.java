package de.fh.dortmund.motorvehicle;

import de.fh.dortmund.license.CarLicense;

public class Car extends MotorVehicle {
	
	private CarLicense carLicense;

	public Car() {
		super();
		System.out.println("Vehicle is car");
	}

	public CarLicense getCarLicense() {
		return carLicense;
	}

	public void setCarLicense(CarLicense carLicense) {
		this.carLicense = carLicense;
	}
	
	

}
