package com.nareshit.screening.test;

public class CommaSplit {
	public static void main(String[] args) {
      String str="Tanmay is boy, he is good, clever boy.";
      String[] res=str.split(",",0);
      for(String myStr:res) {
    	  System.out.println(myStr);
      }
	}

}
