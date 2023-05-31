package com.java.proxypattern;

public class EmployeeDaoProxy implements EmployeeDao {
	EmployeeDao employeeDaoObj;
	public EmployeeDaoProxy() {
		this.employeeDaoObj=new EmployeeDaoImpl();
	}
	@Override
	public void create(String client, EmployeeDao obj) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDaoObj.create(client, obj);
		}
		else
			throw new Exception("Access denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDaoObj.delete(client, employeeId);
		}
		throw new Exception("Access denied");
	}

	@Override
	public EmployeeDao get(String client, int employeeId) throws Exception {
	  if(client.equals("ADMIN") || client.equals("USER"))
		  return employeeDaoObj.get(client, employeeId);
	  
	  throw new Exception("Access denied");

	}

}
