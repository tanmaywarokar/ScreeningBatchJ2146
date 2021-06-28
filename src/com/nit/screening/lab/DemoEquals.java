package com.nit.screening.lab;

public class DemoEquals {
    public static void demoOfEquals() {
    	 String s1 = "HELLO";
         String s2 = "HELLO";
         String s3 =  new String("HELLO");
         System.out.println(s1 == s2); 
         System.out.println(s1 == s3); 
         System.out.println(s1.equals(s2)); 
         System.out.println(s1.equals(s3));
    }

	
	public static void main(String[] args) {
        demoOfEquals();
	}

}
