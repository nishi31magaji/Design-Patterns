package com.java.singletonpattern;

public class SingletonUsingSynchronized {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ABC3 abc3 = ABC3.getIntance();
				System.out.println(abc3.hashCode());				
			}
		});

		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ABC3 abc34 = ABC3.getIntance();
				System.out.println(abc34.hashCode());		
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

class ABC3 {
	// lazy Initialization
	static ABC3 instance;

	private ABC3() {
		System.out.println("instance created");
	}

	public static synchronized ABC3 getIntance() {
		if(instance==null) {
			instance= new ABC3();
			System.out.println("current Thread:"+Thread.currentThread().getName());
		}
		return instance;
	}
}
