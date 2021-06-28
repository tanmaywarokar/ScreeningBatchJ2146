package com.nit.screening.lab;

import java.util.Scanner;

public class ToggleWords {
 public static void toggle(String str) {
	 char[] chArray=str.toCharArray();
	 for(int i=0;i<chArray.length;i++) {
		 if(chArray[i]>='A' && chArray[i]<='Z') {
			 chArray[i]=(char)((int)chArray[i]+32);
		 }
		 else if(chArray[i]>='a' && chArray[i]<='z') {
			 chArray[i]=(char)((int)chArray[i]-32);
		 }
	 }
	 for(int j=0;j<chArray.length;j++) {
		 System.out.print(chArray[j]);
	 }
 }
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str=sc.next();
		System.out.print("Toggled String: ");
		toggle(str);
	}

}
