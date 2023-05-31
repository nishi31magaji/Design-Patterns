package com.java.proxypattern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String client, EmployeeDao obj) throws Exception {
		System.out.println("New Employee Created");		
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		System.out.println("Deleted row with employeeId:"+employeeId);		
		
	}

	@Override
	public EmployeeDao get(String client, int employeeId) throws Exception {
		System.out.println("Fetching data from db");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		return employeeDao;
}

}
