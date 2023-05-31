package com.java.builderpattern;

public class Shop {
public static void main(String[] args) {
	//passing 5 values to construct a constructor is a problem
	// we have to have pass all the parameters.
	//if we do not want to specify ram size still we have to specify something we cannot keep it blank
	//solution builder pattern
	Phone p = new Phone("Android",12,"qualcom",5.5,3100);
	System.out.println(p);
	
	//using builder design pattern
	Phone phone2 = new PhoneBuilder().setOs("Android").getPhone();
	System.out.println(phone2);
}
}
