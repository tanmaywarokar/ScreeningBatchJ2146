package com.nareshit.screening.test2;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
       System.out.println("Enter the String:");
       Scanner sc=new Scanner(System.in);
		String string=sc.next();
		
		for(int i=0;i<=string.length()-1;i++) {
			if( string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i'
					|| string.charAt(i)=='o' || string.charAt(i)=='u' || string.charAt(i)=='A'
					|| string.charAt(i)=='E'
					|| string.charAt(i)=='I'
					|| string.charAt(i)=='O'
					|| string.charAt(i)=='U') {
				System.out.println("Given String Containe vowels at:"+string.charAt(i)+" at the index:"+i);
			}
		}
		
		sc.close();
	}

}
