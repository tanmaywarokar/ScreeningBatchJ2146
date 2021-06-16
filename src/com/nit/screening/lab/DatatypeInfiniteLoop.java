package com.nit.screening.lab;

public class DatatypeInfiniteLoop {

	public static void main(String[] args) {
//        int i=1,j=1;
//        for(int k=1;i==j;k++) {
//        	System.out.println("Infinite loop");
//        }
        
        float i=0.0f,j=0.0f;
        for(float k=1;i==j;k++) {
        	System.out.println("Infinite Loop for float:"+k);
        }
		
//		char c='A',d='A';
//		for(char a='b';c==d; a++) {
//			System.out.println("Infinite Loop for char:"+a);
//		}
	}

}
