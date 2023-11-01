package de.fh.dortmund.contracts;

public class InsuranceContract {

	private RentalContract rentalContract;

	public InsuranceContract() {
		System.out.println("Insurance Contract");

	}

	public void sign() {

	}

	public RentalContract getRentalContract() {
		return rentalContract;
	}

	public void setRentalContract(RentalContract rentalContract) {
		this.rentalContract = rentalContract;
	}

}
