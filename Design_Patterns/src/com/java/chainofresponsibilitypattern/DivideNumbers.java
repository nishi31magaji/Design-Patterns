package com.java.chainofresponsibilitypattern;

public class DivideNumbers implements Chain {
	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain=nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalcWanted().equals("div")) {
			System.out.println("Division:"+(request.getNumber1() / request.getNumber2()));
		}
		else {
			System.out.println("Only works for add,sub,mult,div");
		}
	}
}
