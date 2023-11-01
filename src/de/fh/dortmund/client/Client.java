package de.fh.dortmund.client;

import java.util.List;

import de.fh.dortmund.contracts.RentalContract;
import de.fh.dortmund.contracts.ReservationContract;
import de.fh.dortmund.license.DrivingLicense;
import de.fh.dortmund.rentOffice.RentalOffice;

public class Client {

	private List<Bill> bills;
	private List<DrivingLicense> license;
	private List<ReservationContract> reservationContract;
	private List<RentalContract> rentalContract;
	private RentalOffice rentalOffice;

	public Client() {
		System.out.println("Client");
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public List<DrivingLicense> getLicense() {
		return license;
	}

	public void setLicense(List<DrivingLicense> license) {
		this.license = license;
	}

	public List<ReservationContract> getReservationContract() {
		return reservationContract;
	}

	public void setReservationContract(List<ReservationContract> reservationContract) {
		this.reservationContract = reservationContract;
	}

	public List<RentalContract> getRentalContract() {
		return rentalContract;
	}

	public void setRentalContract(List<RentalContract> rentalContract) {
		this.rentalContract = rentalContract;
	}

	public RentalOffice getRentalOffice() {
		return rentalOffice;
	}

	public void setRentalOffice(RentalOffice rentalOffice) {
		this.rentalOffice = rentalOffice;
	}

}
