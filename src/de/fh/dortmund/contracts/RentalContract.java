package de.fh.dortmund.contracts;

import java.util.Optional;

import de.fh.dortmund.client.Client;

public class RentalContract {

	private Client client;
	private Optional<InsuranceContract> insuranceContract;

	public RentalContract() {
		System.out.println("Rental Contract");
	}

	public void sign() {

	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Optional<InsuranceContract> getInsuranceContract() {
		return insuranceContract;
	}

	public void setInsuranceContract(Optional<InsuranceContract> insuranceContract) {
		this.insuranceContract = insuranceContract;
	}

}
