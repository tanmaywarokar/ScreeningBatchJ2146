package com.nit.java;

public class Arr {
  public int sum3(int arr[]) {
	  int sum=arr[0]+arr[1]+arr[2]; 
	  return sum;
	  }

	
	public static void main(String[] args) {
        int arr[]= {1,2,3};
        Arr array=new Arr();
        
        int result=        array.sum3(arr);

        System.out.println(result);
		
		
	}

}
