package com.java.factorypattern;

public class HDFC implements Bank {

	@Override
	public float getInterestRate() {
		System.out.println("Hello From HDFC");
		return 8.5f;
	}

}
