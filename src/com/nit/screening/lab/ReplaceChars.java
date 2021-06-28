package com.nit.screening.lab;

import java.util.Scanner;

public class ReplaceChars {
	
	public static void replaceChars(String str, char o,char n) {
		System.out.println(str.replace(o,n));
	}

	
    public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println("Enter old char to replace:");
		char o=sc.next().charAt(0);
		System.out.println("Enter new char to replace:");
		char n=sc.next().charAt(0);
    	replaceChars(str,o,n);
	}
}
