package com.nareshit.screening.test;

import java.util.HashMap;

public class CountOccurences {

	public static void main(String[] args) {
      String str="TanmayTejas";
      HashMap<Character,Integer> hmap=new HashMap<>();
      for(int i=str.length()-1;i>=0;i--){
    	  if(hmap.containsKey(str.charAt(i))) {
    		  int count=hmap.get(str.charAt(i));
    		  hmap.put(str.charAt(i),++count);
    	  }
    	  else {
    		  hmap.put(str.charAt(i),1);
    	  }
      }
      System.out.println(hmap);
	}

}
