package com.java.factorypattern;

public class SBI implements Bank{

	@Override
	public float getInterestRate() {
		System.out.println("Hello From SBI");
		return 9.35f;
	}

}
