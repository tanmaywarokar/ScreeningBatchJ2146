package com.nit.screening.lab;

import java.util.Scanner;

public class DuplicateChars {
 
	public static void duplicateChars(String str) {
		int count;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[i]!=' ') {
					count++;
					arr[j]='0';
				}
			}
			if(count > 1 && arr[i]!='0') {
				System.out.println(arr[i]);
			}
		}

	}
	
	public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        duplicateChars(str);
	}

}
