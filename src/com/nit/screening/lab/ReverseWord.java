package com.nit.screening.lab;

import java.util.Scanner;

public class ReverseWord {

	public static void reverseWord(String str) {
		char[]string=str.toCharArray();
		for(int i=string.length-1;i>=0;i--) {
			System.out.print(string[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter String:");
	       String str=sc.next();
	       reverseWord(str);
	}

}
