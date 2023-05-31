package com.java.observerpattern;

public class Subscriber {
	private String name;
	private Channel channel = new Channel();
	
	
	public Subscriber(String name) {
		this.name=name;
	}
	public void update() {
		System.out.println("hey "+ name + " video uploaded:" + channel.getTitle());
	}
	public void subscribeChannel(Channel ch) {
			channel = ch;
	}
}
