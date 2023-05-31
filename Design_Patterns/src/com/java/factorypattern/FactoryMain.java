package com.java.factorypattern;

public class FactoryMain {
 public static void main(String args[]) {
	OperatingSystemFactory osf = new OperatingSystemFactory();
	OS obj = osf.getInstance("other");
	obj.spec();
 }
}
