package com.java.singletonpattern;

public class SingletonDemoEagerInitialization {
public static void main(String[] args) {
	ABC abc = ABC.getIntance();
	System.out.println(abc.hashCode());
	ABC abc2 = ABC.getIntance();
	System.out.println(abc2.hashCode());
	System.out.println(abc.equals(abc2));

}
}
class ABC{
	//eager Initialization
	static ABC instance = new ABC();
	private ABC() {
		System.out.println("instance created");
	}
	public static ABC getIntance() {
		return instance;
	}
}
