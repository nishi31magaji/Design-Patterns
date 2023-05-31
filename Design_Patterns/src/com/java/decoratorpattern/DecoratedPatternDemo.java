package com.java.decoratorpattern;

public class DecoratedPatternDemo {
public static void main(String[] args) {
	Shape circle = new Circle();
	Shape redCircle = new RedShapeDecorator(new Circle());
	circle.draw();
    System.out.println("Circle with normal border");

	
    System.out.println("\nCircle of red border");
	redCircle.draw();
}
}
