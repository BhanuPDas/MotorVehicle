package de.fh.dortmund.license;

import de.fh.dortmund.motorvehicle.Car;
import de.fh.dortmund.motorvehicle.Van;

public class CarLicense extends DrivingLicense {

	private Car car;
	private Van van;

	public CarLicense() {
		super();
		System.out.println("Car License");
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Van getVan() {
		return van;
	}

	public void setVan(Van van) {
		this.van = van;
	}

}
