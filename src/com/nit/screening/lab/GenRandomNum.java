package com.nit.screening.lab;

import java.util.Random;

public class GenRandomNum {
  public static void genRandomNumber() {
	  Random r=new Random();
	  System.out.println(r.nextInt(1000000));
  }
	public static void main(String[] args) {
       genRandomNumber();
	}

}
