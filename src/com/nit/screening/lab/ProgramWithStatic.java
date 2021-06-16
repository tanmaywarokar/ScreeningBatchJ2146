package com.nit.screening.lab;

public class ProgramWithStatic {

	static int a=10;
	static int b=20;
	static int sum;
	public static void sum() {
		sum=a+b;
		System.out.println("A value is:"+a);
		System.out.println("B value is:"+b);
		System.out.println("Sum of A & B is:"+sum);
	}
	public static void main(String[] args) {
        sum();		
	}

}
