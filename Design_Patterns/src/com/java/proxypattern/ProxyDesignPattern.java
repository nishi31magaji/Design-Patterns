package com.java.proxypattern;

public class ProxyDesignPattern {
public static void main(String[] args) {
	try {
		EmployeeDao employeeDao = new EmployeeDaoProxy();
		employeeDao.create("ADMIN", employeeDao);
		System.out.println("Operation successful");
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}
