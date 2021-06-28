package com.nit.screening.lab;

import java.util.Scanner;

public class ArithmeticExceptionEx {

	public static void arithExc(int num,int den) {


		if(den==0) {
			throw new ArithmeticException("Denominator is 0");
		}
		float res=num/den;
		System.out.println(res);
	}

	public static void main(String[] args) {
		System.out.println("Enter Numerator:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Denominator:");
		int d=sc.nextInt();

		arithExc(n,d);
	}

}
