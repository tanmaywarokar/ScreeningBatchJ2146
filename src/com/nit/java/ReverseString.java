package com.nit.java;

public class ReverseString {

//	static int i=20;
	public static void main(String[] args) {
//        StringBuffer s1=new StringBuffer("Java IS Awesome.");
//        
//        s1.reverse();
//        String reverse=s1.toString();
////        char ch[]=s1.toCharArray();
////        for(int i=ch.length-1;i>=0;i--) {
////        	reverse=reverse+ch[i];
////        }
////        System.out.println(reverse);
//        
//        System.out.println(reverse);
//		int i=30;
//		System.out.println(i);
//		init();
		m1(2);
	}
              
	public static void m1(int i) {
		if(i>=0) {
			m1(i-1);
			System.out.println(i);
		}
		System.out.println(i);
	}
}
