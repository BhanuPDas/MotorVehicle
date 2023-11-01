package de.fh.dortmund.motorvehicle;

import de.fh.dortmund.license.TruckLicense;

public class Truck extends MotorVehicle {
	
	private TruckLicense truckLicense;

	public Truck() {
		super();
		System.out.println("Vehicle is truck");
	}

	public TruckLicense getTruckLicense() {
		return truckLicense;
	}

	public void setTruckLicense(TruckLicense truckLicense) {
		this.truckLicense = truckLicense;
	}
	
	

}
