package de.fh.dortmund.rentOffice;

import java.util.List;

import de.fh.dortmund.client.Client;
import de.fh.dortmund.contracts.ReservationContract;
import de.fh.dortmund.motorvehicle.MotorVehicle;

public class RentalOffice {

	private List<Client> clients;
	private List<MotorVehicle> mv;
	private List<ReservationContract> reservationContract;
	private Category category;
	private Period period;

	public RentalOffice() {
		System.out.println("Rental Office");
	}

	public void reserve(Category category, Period period) {
		System.out.println("Reserve");
	}

	public void fetch() {
		System.out.println("Fetch");
	}

	public MotorVehicle returnVehicle(MotorVehicle mv) {

		return mv;

	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<MotorVehicle> getMv() {
		return mv;
	}

	public void setMv(List<MotorVehicle> mv) {
		this.mv = mv;
	}

	public List<ReservationContract> getReservationContract() {
		return reservationContract;
	}

	public void setReservationContract(List<ReservationContract> reservationContract) {
		this.reservationContract = reservationContract;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

}
