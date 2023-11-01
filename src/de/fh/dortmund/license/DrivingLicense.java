package de.fh.dortmund.license;

import de.fh.dortmund.client.Client;

public class DrivingLicense {

	private Client client;

	public DrivingLicense() {
		System.out.println("Motor Vehicle License");
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
