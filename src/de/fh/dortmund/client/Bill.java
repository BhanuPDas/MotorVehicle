package de.fh.dortmund.client;

public class Bill {

	private Client bills;

	public Bill() {
		System.out.println("Bills");
	}

	public void pay() {
		System.out.println("Client Bills");

	}

	public Client getBills() {
		return bills;
	}

	public void setBills(Client bills) {
		this.bills = bills;
	}

}
