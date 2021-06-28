package com.nit.java;

public class ClassA {

    public String doubleChar(String str){
       String string="";
       for(int i=0;i<str.length();i++) {
    	   string=string+str.charAt(i)+str.charAt(i);
       }
       return string;
    			
    }
    public static void main(String []args){
       ClassA a=new ClassA();
       System.out.println(a.doubleChar("Tan"));
       System.out.println((int)'A');
       System.out.println("--------------------------------");
       String str1 = "encyclopedia";
       String str2 = "Encyclopedia";
       int result;

       // comparing str1 with str2
       result = str1.compareTo(str2);
       System.out.println(result); // 32
    }
}
