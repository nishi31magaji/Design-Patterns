package com.java.chainofresponsibilitypattern;

public class SubstractNumbers implements Chain {
	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if (request.getCalcWanted().equals("sub")) {
			System.out.println("Substraction:" + (request.getNumber1() - request.getNumber2()));
		} else {
			nextChain.calculate(request);
		}
	}

}
