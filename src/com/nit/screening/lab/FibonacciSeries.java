package com.nit.screening.lab;

import java.util.Scanner;

public class FibonacciSeries {

	public static void fibonacci(int num) {
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" , "+n2);
		for(int i=2;i<=num;i++) {
            n3=n1+n2;
            System.out.print(" , "+n3);
            n1=n2;n2=n3;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Count:");
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      fibonacci(n);
	}

}
