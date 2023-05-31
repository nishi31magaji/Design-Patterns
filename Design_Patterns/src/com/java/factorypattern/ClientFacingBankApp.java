package com.java.factorypattern;

public class ClientFacingBankApp {
public static void main(String[] args) {
	BankFactory bankFactory = new BankFactory();
	Bank bank = bankFactory.getInstance("HDFC");
	System.out.println(bank.getInterestRate());
	
}
}
