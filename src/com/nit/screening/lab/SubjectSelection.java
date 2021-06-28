package com.nit.screening.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectSelection {

	public static void subjectSelect(int sub) {
		switch(sub) {
		case 1:
			System.out.println("JAVA is selected");
			break;		
		case 2:
			System.out.println("C++ is selected");
			break;		
		case 3:
			System.out.println("PYTHON is selected");
			break;		
		case 4:
			System.out.println("PHYSICS is selected");
			break;
			
		default:
			System.out.println("Not valid Input");
		}

	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Suject Selection:");
		System.out.println("1. JAVA");
		System.out.println("2. C++");
		System.out.println("3. PYTHON");
		System.out.println("4. PHYSICS");

		System.out.println("Enter specific numbers:");
	    System.out.println("Enter number of courses you want to check:");
	    int i=sc.nextInt();
		ArrayList<Integer> subs=new ArrayList<Integer>(i);
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		int sub4=sc.nextInt();
		if(subs.size()==1 ) {
			subs.add(sub1);
		}
		else 		if(subs.size()==2 ) {
			subs.add(sub1,sub2);
		}
		
		if(subs.size()==3 ) {
			subs.add(sub3);
		}
		//subs.add(sub1);
		
		
		
		
		
		
		
		
		
		
		System.out.println("Do you want to enter another subject: (YES/NO)");
		String ask=sc.next();
		if(ask.equals("YES")) {
//			int sub2=sc.nextInt();

		}
		else if(ask.equals("NO")) {
          System.out.println("Ok Thank You");
		}
		else {
			System.out.println("Invalid Input");
		}
		subjectSelect(sub1);
	}

}
