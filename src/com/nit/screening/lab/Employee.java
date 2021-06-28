package com.nit.screening.lab;

import java.io.Serializable;

public class Employee implements Cloneable,Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empId;
    String empName;
    public Employee(){
    	
    }
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
		System.out.println(empName+" have id: "+empId);
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
