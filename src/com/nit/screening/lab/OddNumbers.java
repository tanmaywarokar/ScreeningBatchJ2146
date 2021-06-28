package com.nit.screening.lab;

import java.util.Scanner;

public class OddNumbers {
public static void oddNumber(int num) {
	for(int i=1;i<=num;i++) {
		if(i%2==1) {
			System.out.print(i+", ");
		}
	}
}
public static void main(String[] args) {
	System.out.println("Enter Number:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    oddNumber(n);
}
}
