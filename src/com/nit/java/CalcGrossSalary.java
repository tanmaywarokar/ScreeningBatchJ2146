package com.nit.java;

import java.util.Scanner;

public class CalcGrossSalary {

	public double calculate(String name, double basic) {
		double grossSal, hra, da;
		System.out.println(name+" Gross Salary");
		if(basic<=10000) {
			hra=basic*0.2;
			da=basic*0.8;
		}
		else if(basic<=20000) {
			hra=basic*0.25;
			da=basic*0.9;
		}
		else {
			hra=basic*0.30;
			da=basic*0.95;
		}
		
		grossSal=basic+hra+da;
		return grossSal;
	}
	
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name=scanner.next();
		System.out.println("Enter Basic Salary:");
		double basicSal=scanner.nextDouble();
		CalcGrossSalary grossSalary=new CalcGrossSalary();
		System.out.println(grossSalary.calculate(name, basicSal));
		
		scanner.close();
	}

}
