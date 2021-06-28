package com.nit.screening.lab;

public class StaticPracticeQues {
	
	static int x=StaticPracticeQues.m1();
	int y;
	public static void main(String[] args) {
		 final int y=10;
		System.out.println(StaticPracticeQues.x);
	}
	
	static int m1() {
		StaticPracticeQues.x=10;
		return StaticPracticeQues.m2();
	}

	static int m2() {
		System.out.println(StaticPracticeQues.x);
		return 20;
	}
}

//10
//20