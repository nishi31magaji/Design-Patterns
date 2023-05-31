package com.java.singletonpattern;

public class SingletonUsingDoubleCheckLocking {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				DoubleCheck doubleCheck = DoubleCheck.getIntance();
				System.out.println(doubleCheck.hashCode());				
			}
		});

		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				DoubleCheck doubleCheck = DoubleCheck.getIntance();
				System.out.println(doubleCheck.hashCode());		
			}
		});
		t1.start();
		/*
		 * try { Thread.sleep(10); } catch(InterruptedException e) {
		 * 
		 * }
		 */		t2.start();
		
	}
}

class DoubleCheck {
	// lazy Initialization
	static DoubleCheck instance;

	private DoubleCheck() {
		System.out.println("instance created");
	}

	public static DoubleCheck getIntance() {
		if (instance == null) {
			synchronized (DoubleCheck.class) {
				if (instance == null) {
					instance = new DoubleCheck();
				}
			}
		}
		return instance;
	}
}
