package com.nit.java;

public class PrintKInStar {

	public static void main(String[] args) {

		int count=6;
		for(int i=1;i<11;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=6;k++) {
				if(k==count) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			if(i<=5) {
				count--;
			}
			else if(i<=11) {
				count++;
			}
			System.out.println();
		}
	}

}
