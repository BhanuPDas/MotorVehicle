package de.fh.dortmund.license;

import de.fh.dortmund.motorvehicle.Truck;

public class TruckLicense extends DrivingLicense {

	private Truck truck;

	public TruckLicense() {
		super();
		System.out.println("Truck License");
	}

	public Truck getTruck() {
		return truck;
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}

}
