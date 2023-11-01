package de.fh.dortmund.main;

import java.util.List;

import de.fh.dortmund.client.Bill;
import de.fh.dortmund.client.Client;

public class VehicleReservationMain {

	public static void main(String[] args) {
		System.out.println("Create Client data for reservation");

		Client client = new Client();
		List<Bill> bills = client.getBills();
		for (Bill b : bills) {
			b.pay();
		}
	}

}
