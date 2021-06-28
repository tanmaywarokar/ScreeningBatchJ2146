package com.nit.java;

import java.util.Scanner;

public class OddNumbersTillN {

	public static void printOddTillN(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd numbers till "+n+" is: "+sum);
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=sc.nextInt();
		printOddTillN(n);
		sc.close();
	}

}
