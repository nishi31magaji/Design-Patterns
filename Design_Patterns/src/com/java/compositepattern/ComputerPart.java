package com.java.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class ComputerPart {

}

interface Component {
	void showPrice();
}

class Leaf implements Component {
	int price;
	String name;

	@Override
	public void showPrice() {
		System.out.println(name + " : " + price);
	}

	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

}

class Composite implements Component {
	String name;
	public Composite(String name) {
		super();
		this.name = name;
	}

	List<Component> components = new ArrayList<>();

	public void addComponents(Component compnent) {
		components.add(compnent);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for (Component component : components) {
			component.showPrice();
		}
	}

}