package com.nit.screening.lab;

import java.util.Scanner;

public class NumbersStarPattern {
   //To Print 0
	static void meth0(){
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1 || j==5 || i==1 || i==5)
				System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	//To Print 1
	static void meth1() {
		for(int i=1;i<=5;i++) {
		
			for(int j=1;j<=3;j++) {
				if(j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	   //To Print 2
	static void meth2() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==3 || i==5 || i==2 && j==5 || i==4 && j==1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	   //To Print 3
	static void meth3() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==3 || i==5 || j==5)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	   //To Print 4
	static void meth4() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=3 && j==1 || i==3 || j==4) {
					System.out.print("*");
			    }
			else {
				System.out.print(" ");
			}
			
			}
			System.out.println();
		}
	}
	
	   //To Print 5
	static void meth5() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=3 && j==1 || i==1 || i==5|| i==3 || i>=3 && j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void meth6() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || j==1 || i==3 || i==5 || i>=3 && j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	}
	
	static void meth7() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i<=5 && j==5 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void meth8() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==3 || i==5 || j==1 || j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void meth9() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==3 || i==5 || j==5 || i<=3 && j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=sc.nextInt();
		switch(i) {
		case 0:
			meth0();
			break;
		
		case 1:
			meth1();
			break;
			
		case 2:
			meth2();
			break;
			
		case 3:
			meth3();
			break;
		
		case 4:
			meth4();
			break;
			
		case 5:
			meth5();
			break;
		
		case 6:
			meth6();
			break;
			
		case 7:
			meth7();
			break;
			
		case 8:
			meth8();
			break;
			
		case 9:
			meth9();
			break;
			
			default:
				System.out.println("Invalid Input");
		}
		sc.close();
	}

}
