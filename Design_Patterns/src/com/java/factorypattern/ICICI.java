package com.java.factorypattern;

public class ICICI implements Bank {

	@Override
	public float getInterestRate() {
		System.out.println("Hello From ICICI");
		return 8;
	}

}
