package com.java.compositepattern;

public class CompositeTest {
	public static void main(String[] args) {
		Component hd = new Leaf(4000, "HDD");
		Component mouse = new Leaf(1000, "Mouse");
		Component monitor = new Leaf(3000, "Monitor");
		Component ram = new Leaf(3500, "RAM");
		Component cpu = new Leaf(8000, "CPU");

		Composite ph = new Composite("Peripherals");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");

		mb.addComponents(cpu);
		mb.addComponents(ram);

		ph.addComponents(mouse);
		ph.addComponents(monitor);
		cabinet.addComponents(hd);
		cabinet.addComponents(mb);

		computer.addComponents(ph);
		computer.addComponents(cabinet);
		
		ph.showPrice();
		computer.showPrice();

	}
}
