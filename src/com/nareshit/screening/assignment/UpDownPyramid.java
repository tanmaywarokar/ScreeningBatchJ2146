package com.nareshit.screening.assignment;

import java.util.Scanner;

public class UpDownPyramid {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++) {
		
			for(int j=rows-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=(i*2)-1;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int space=1;

		for(int i=1;i<rows;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space++;
			for(int k=2*(rows-i)-1;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
