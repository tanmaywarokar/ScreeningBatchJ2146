package com.nareshit.screening.test2;

public class RemoveWhitespace {

	public static void main(String[] args) {
//		 System.out.println("Enter the String:");
//	       Scanner sc=new Scanner(System.in);
//			String string=sc.next();
            String string="   Tanmay";
			string=string.replaceAll("\\s", "");
			System.out.println("Removed Spaces:"+string);
//			sc.close();
	}

}
