package com.nit.screening.lab;

import java.util.Scanner;

public class PrintNNumbers {

	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scanner.nextInt();
//		for(int i=1;i<=num;i++) {
//			System.out.println(i);
//		}
		
		int i=1;
		while(i<=num) {
			System.out.println(i);
			i++;
		}
		
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while(i<=num);	
	}
		

}
