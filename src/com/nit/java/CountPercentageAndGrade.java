package com.nit.java;

import java.util.Scanner;

public class CountPercentageAndGrade {
	int sum; double per;
    public void computePerAndGrade(String name,int phy,int chem, int bio, int maths, int comp) {
    	System.out.println("-------Result-------");
    	System.out.println("--------------------");
    	System.out.println("Student Name is:"+name);
    	sum=phy+chem+bio+maths+comp;
        per=(sum/500.0)*100;
    	System.out.println("His Percentage is:"+per);
    	
    	if(per>=90) {
    		System.out.println("Grade is: 'A'");
    	}
    	else if(per>=80) {
    		System.out.println("Grade is: 'B'");
    	}
    	else if(per>=70) {
    		System.out.println("Grade is: 'C'");
    	}
    	else if(per>=60) {
    		System.out.println("Grade is: 'D'");
    	}
    	else if(per>=40) {
    		System.out.println("Grade is: 'E'");
    	}
    	else {
    		System.out.println("Fail:Grade 'F'");
    	}
    	
    }
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=scanner.next();
		System.out.println("Enter Physics Marks:");
		int phy=scanner.nextInt();
		System.out.println("Enter Chemistry Marks:");
		int chem=scanner.nextInt();
		System.out.println("Enter Biology Marks:");
		int bio=scanner.nextInt();
		System.out.println("Enter Mathematics Marks:");
		int maths=scanner.nextInt();
		System.out.println("Enter Computer Marks:");
		int comp=scanner.nextInt();
		scanner.close();
		CountPercentageAndGrade obj=new CountPercentageAndGrade();
		obj.computePerAndGrade(name,phy,chem,bio,maths,comp);
	}

}
