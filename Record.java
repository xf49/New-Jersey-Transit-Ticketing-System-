package com.example.demo.record;

import java.io.Serializable;
import java.sql.Timestamp;

public class Record implements Serializable {

	private double amount;
	
	private long time;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getTimestamp() {
		time=System.currentTimeMillis();
		return time;
	}

	@Override
	public String toString() {
		return "Record [amount=" + amount + ", time=" + time + "]";
	}
	
}
