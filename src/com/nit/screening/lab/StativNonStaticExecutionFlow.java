package com.nit.screening.lab;

public class StativNonStaticExecutionFlow {

	static int a=10;
	static int b=20;
	
	int c=30;
	int d=40;
	
	public void nonStaticFlow() {
		System.out.println("We can access both the static and non static variable in non static method:");
		System.out.println("Static Variable a="+a);
		System.out.println("Static variable b="+b);
		System.out.println("Non-Static variable c="+c);
		System.out.println("Non-Static variable d="+d);
	}
	
	public static void staticFlow() {
		System.out.println("We can access static without creating object and non static variable can be access using object of class only:");
        System.out.println("Static variable a="+a);
        System.out.println("Static variable b="+b);
		System.out.println("Non-Static variable c using object="+new StativNonStaticExecutionFlow().c);
		System.out.println("Non-Static variable d using object="+new StativNonStaticExecutionFlow().d);       
	}
	
	public static void revalue() {
//		a=c;
//		b=d;
	}
	public static void main(String[] args) {
		StativNonStaticExecutionFlow obj=new StativNonStaticExecutionFlow();
		obj.nonStaticFlow();
		staticFlow();
	}
}
