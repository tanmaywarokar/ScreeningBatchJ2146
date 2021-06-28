package com.nit.java;

import java.util.Scanner;

public class MainEmployee {
    int empId;
    String empName;
    String empDept;
    double empSal;
	public static void main(String[] args) {

		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id:");
		e.setEmpId(sc.nextInt());
		
		System.out.println("Enter emp name:");
		e.setEmpName(sc.next());

		System.out.println("Enter emp Sal:");
		e.setEmpSal(sc.nextDouble());
		System.out.println("Enter emp dept:");
		e.setEmpDept(sc.next());
		
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpSal());
		System.out.println(e.getEmpDept());
	}

}
