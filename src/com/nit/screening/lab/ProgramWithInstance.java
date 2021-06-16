package com.nit.screening.lab;

public class ProgramWithInstance {

	int i=10;
	int j=20;
	
	public void subtract() {
		int a=new ProgramWithInstance().i;
		int b=new ProgramWithInstance().j;
		System.out.println("Value of i="+a);
		System.out.println("Value of j="+b);
		System.out.println("Subtraction of j - i ="+(b-a));
	}
	public static void main(String[] args) {
		new ProgramWithInstance().subtract();
	}

}
