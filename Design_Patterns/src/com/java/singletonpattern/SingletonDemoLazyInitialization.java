package com.java.singletonpattern;

public class SingletonDemoLazyInitialization {
	public static void main(String[] args) {
		ABC2 abc = ABC2.getIntance();
		System.out.println(abc.hashCode());
		ABC2 abc2 = ABC2.getIntance();
		System.out.println(abc2.hashCode());
		System.out.println(abc.equals(abc2));

	}
}

class ABC2 {
	// lazy Initialization
	static ABC2 instance;

	private ABC2() {
		System.out.println("instance created");
	}

	public static ABC2 getIntance() {
		if(instance==null)
			instance= new ABC2();
		return instance;
	}
}
