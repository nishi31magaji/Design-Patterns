package com.java.singletonpattern;

public class SingletonPatternEnum {
	public static void main(String[] args) {
		singleton s1 = singleton.INSTANCE1;
		s1.i = 5;
		System.out.println(s1.i);
		System.out.println(s1.hashCode());
		singleton s2 = singleton.INSTANCE1;
		s2.i = 6;
		System.out.println(s2.i);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());

	}
}

enum singleton { // enum is a special type of a class.
	INSTANCE1;

	int i;

	public void show() {
		System.out.println(i);
	}

	singleton() {
		System.out.println("singleton enum constructor");
	}
}
