package com.nareshit.screening.assignment;

public class FullNameHorizontal {
public static void main(String[] args) {
		
		//T
       for(int i=1;i<=5;i++) {
    	   for(int j=1;j<=5;j++) {
    		   if(i==1 || j==5/2+1) {
    			   System.out.printf("**");
    		   }
    		   else {
    			   System.out.printf("  ");
    		   }
    	   }
    	   
    	   // A
    	   for(int j=5;j>i;j--) {
    		   System.out.printf("  ");
    	   }
    	   for(int k=1;k<=(2*i)-1;k++) {
    		   if(k==1 || k==(2*i)-1 || i==3) {
    			   System.out.printf("**");
    		   }
    		   else {
    			   System.out.printf("  ");
    		   }
    	   }
    	   for(int l=5;l>=i;l--) {
    		   System.out.print("  ");
    	   }
    	   
    	   // N
    	   for(int j=1;j<=5;j++) {
    		   if(j==1 || j==5 || i==j) {
    			  System.out.print("**");
    		   }
    		   else{
    			  System.out.print("  ");
    		   }
    	   }
    	   
    	   for(int k=2;k<=2;k++) {
    		   System.out.print("  ");
    	   }
    	   
    	   // M
    	   for(int j=1;j<=5;j++) {
		   if(j==1 || j==5 || i==2 && j==2 || i==3 && j==3 || i==2 && j==4 ) {
			   System.out.print("**");
		   }
		   else {
			   System.out.print("  ");
		   }
	   }
    	   
    	   for(int k=2;k<=2;k++) {
    		   System.out.print("  ");
    	   }
    	   
    	   // A
    	   for(int j=5;j>i;j--) {
    		   System.out.print("  ");
    	   }
    	   for(int k=1;k<=(2*i)-1;k++) {
    		   if(k==1 || k==(2*i)-1 || i==3) {
    			   System.out.print("**");
    		   }
    		   else {
    			   System.out.print("  ");
    		   }
    	   }
    	  
       	   for(int x=5;x>=i;x--){
    		   System.out.print("  ");
    	   }
       
    	   // Y
           for(int j=1;j<i;j++) {
        	   if( i==4 || i==5) {
        		   continue;
        	   }
        	   System.out.print("  ");
           }
           for(int k=2*(4-i)-1;k>=1;k--) {
        	   if(i==4 || i==5) {
        		   continue;
        	   }
        	   if(k==1 || k==2*(4-i)-1) {
        		  System.out.print("**"); 
        	   }
        	   else {
        		   System.out.print("  ");
        	   }
           }
           if(i==4 || i==5) {
        	   for(int j=1;j<=2;j++) {
        		   System.out.print("  ");
        	   }
        	   for(int k=1;k<=1;k++) {
        		   System.out.print("**");
        	   }
           }
	   System.out.println();
  
   
//	   //Y
//       for(int i=1;i<3;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=2*(5-i)-1;k>=1;k--) {
//				if(k==1 || k==2*(5-i)-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//    	     	   
//    	   
//       }
//
//	   
//       for(int i=1;i<=3;i++) {
//    	   for(int j=1;j<=4;j++) {
//    		   System.out.print(" ");
//    	   }
//    	   for(int k=1;k<=3;k++) {
//    		   if(k==1)
//    		   System.out.print("*");
//    		   else {
//    			   System.out.print(" ");
//    		   }
//    	   }
//    	   System.out.println();
//       }
	}

  }
}
