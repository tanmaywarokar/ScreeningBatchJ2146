package com.nit.screening.lab;

import java.util.Scanner;

public class PrimeNumbers {

	
	public static void prime(int n) {
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("Not prime");
		}
		else if(count==2) {
			System.out.println("Prime");
		}	
	}
	
	public static void printNPrime(int n) {
		int count=0;
		for(int i=2;i<=n;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" , ");
			}
		}
	}
	public static void main(String[] args) {
      System.out.println("Enter Last Number:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      prime(n);
      printNPrime(n);
	}

}
