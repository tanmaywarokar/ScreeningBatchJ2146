package com.nareshit.screening.test2;

import java.util.Scanner;

public class Palindrome {

	public  void inputString(String string2) {

		String string=string2;
	       String revString="";
	       for(int i=string.length()-1;i>=0;i--) {
	    	   revString=revString+string.charAt(i);
	    	   
	       }
	       if(string.equals(revString)) {
    		   System.out.println("Palindrome string");
    	   }
    	   else {
    		   System.out.println("Not palindrome string");
    	   }
	}
	
	public void inputNumber(int i) {
		int number=i;
		int temp=number;
		int sum=0;
		int r=0;            
		while(number>0) {
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
		}
		
		if(temp==sum) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
		
	}
	public static void main(String[] args) {
		 System.out.println("Enter the String or number:");
	       @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
			String string=sc.next();
			Palindrome p=new Palindrome();
			p.inputString(string);
			int i=sc.nextInt();
			p.inputNumber(i);
            sc.close();
			
		
	}

}
