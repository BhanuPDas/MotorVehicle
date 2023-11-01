package de.fh.dortmund.rentOffice;

import java.util.Date;

public class Period {

	private Date fromPeriod;
	private Date toPeriod;

	public Period() {
		System.out.println("Period");
	}

	public Date getFromPeriod() {
		return fromPeriod;
	}

	public void setFromPeriod(Date fromPeriod) {
		this.fromPeriod = fromPeriod;
	}

	public Date getToPeriod() {
		return toPeriod;
	}

	public void setToPeriod(Date toPeriod) {
		this.toPeriod = toPeriod;
	}

}
