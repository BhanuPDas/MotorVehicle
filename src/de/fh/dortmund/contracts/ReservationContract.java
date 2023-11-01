package de.fh.dortmund.contracts;

import de.fh.dortmund.client.Client;
import de.fh.dortmund.rentOffice.RentalOffice;

public class ReservationContract {

	private RentalOffice rentalOffice;
	private Client client;

	public ReservationContract() {
		System.out.println("ReservationContract");
	}

	public void sign() {

	}

	public void cancel() {

	}

	public RentalOffice getRentalOffice() {
		return rentalOffice;
	}

	public void setRentalOffice(RentalOffice rentalOffice) {
		this.rentalOffice = rentalOffice;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
