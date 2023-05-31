package com.java.observerpattern;

public class YouTube {
public static void main(String[] args) {
	Channel voiceOverByNishi = new Channel();
	Subscriber s1 = new Subscriber("nishi");
	Subscriber s2 = new Subscriber("mani");
	Subscriber s3 = new Subscriber("pooja");
	Subscriber s4 = new Subscriber("sheetal");
	voiceOverByNishi.subscribe(s1);
	voiceOverByNishi.subscribe(s2);
	voiceOverByNishi.subscribe(s3);
	voiceOverByNishi.subscribe(s4);
	
	voiceOverByNishi.unsubscribe(s4);

	s1.subscribeChannel(voiceOverByNishi);
	s2.subscribeChannel(voiceOverByNishi);
	s3.subscribeChannel(voiceOverByNishi);
	s4.subscribeChannel(voiceOverByNishi);
	
	voiceOverByNishi.upload("How to learn programming");
	



}
}
