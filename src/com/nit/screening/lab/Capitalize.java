package com.nit.screening.lab;

import java.util.Scanner;

public class Capitalize {

	public static void capitalize(String str) {
		str.toUpperCase();
		System.out.println(str.toUpperCase());
	}
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String:");
       String str=sc.next();
       capitalize(str);
	}

}
