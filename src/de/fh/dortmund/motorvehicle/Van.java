package de.fh.dortmund.motorvehicle;

import de.fh.dortmund.license.CarLicense;

public class Van extends Truck {

	private CarLicense carLicense;

	public Van() {
		super();
		System.out.println("Vehicle is van");
	}

	public CarLicense getCarLicense() {
		return carLicense;
	}

	public void setCarLicense(CarLicense carLicense) {
		this.carLicense = carLicense;
	}
	
	

}
