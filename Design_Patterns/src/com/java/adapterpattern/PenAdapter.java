package com.java.adapterpattern;

public class PenAdapter implements Pen {
	PilotPen pp = new PilotPen();
	@Override
	public void write(String str) {
		pp.getMarks(str);
	}

}
