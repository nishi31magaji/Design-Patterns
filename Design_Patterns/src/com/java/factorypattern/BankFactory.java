package com.java.factorypattern;

public class BankFactory {
public Bank getInstance(String bankName) {
	if(bankName.equalsIgnoreCase("SBI"))
		return new SBI();
	else if(bankName.equalsIgnoreCase("HDFC"))
		return new HDFC();
	else if(bankName.equalsIgnoreCase("ICICI"))
		return new ICICI();
	else
		return new Bank() {
			
			@Override
			public float getInterestRate() {
				// TODO Auto-generated method stub
				return 6;
			}
		};
}
}
