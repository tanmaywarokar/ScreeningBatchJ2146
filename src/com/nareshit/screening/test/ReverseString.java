package com.nareshit.screening.test;

public class ReverseString {

	public  static void inputString(String string2) {

		String string=string2;
	       String revString="";
	       for(int i=string.length()-1;i>=0;i--) {
	    	   revString=revString+string.charAt(i);
	       }
	       System.out.println(revString);
	}
	
	public static void main(String[] args) {
       String str="Tanmay Warokar";
       inputString(str);
	}

}
