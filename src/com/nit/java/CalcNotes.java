package com.nit.java;

import java.util.Scanner;

public class CalcNotes {

	public static void countCurrency(int amount) {
		int notes[]= {500,100,50,20,10,5,2,1};
		int notesCounter[]=new int[8];
		
		for(int i=0;i<8;i++) {
			if(amount>=notes[i]) {
				notesCounter[i] = amount/notes[i];
				amount=amount-notes[i]*notesCounter[i];
			}
		}
		
		System.out.println("Currency Count:");
		for(int i=0;i<8;i++) {
			if(notesCounter[i]!=0) {
				System.out.println("Amount: "+notes[i]+" notes required:"+notesCounter[i]);
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount:");
		int amount=sc.nextInt();
		countCurrency(amount);
		sc.close();
	}

}
