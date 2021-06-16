package com.nit.screening.lab;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		boolean a=true;
		
		int count=0;
        for(;;) {
        	System.out.println("Infinite For");
        	if(count==100) {
        		System.out.println("Breaked");
        		break;
        	}
        	count++;
       }
        
//        
//        while(a) {
//        	System.out.println("Infinite While");
//        }
        
//        do {
//        	System.out.println("Infinite Do While");
//        }
//        while(a);
	}

}
