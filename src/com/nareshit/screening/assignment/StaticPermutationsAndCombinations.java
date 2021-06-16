package com.nareshit.screening.assignment;

public class StaticPermutationsAndCombinations {

	static int a=30;
	int b=40;

	
	// 1. static variable can be accessed using class name and 2. by static method also
	public static void meth1() {
		System.out.println("meth1()");
		System.out.println("static variable can be accessed using class name="+StaticPermutationsAndCombinations.a);
	}

	// 2. static variables can be accessed by static and non static methods
	public void meth2() {
		System.out.println("meth2()");
       System.out.println("static variables can be accessed by non static methods a:"+a);
	}
	
	// 3. static variables reduce the amount of memory used by program
    public void meth3() {
		System.out.println("meth3()");
    	System.out.println("As static variables are global variables they can be shared among a class thats why we need not to create object of class which saves space in Stack area. ");
    	System.out.println();
    	System.out.println("As Instance variable are accessed using only object we need to create the object of it where it takes space in heap to store each object with variables.");
    }
    
	// 6. static methods can not be overridden 
    public static void meth4() {
    	System.out.println("meth4()");
    	System.out.println("All is good.");
    }

	public static void main(String[] args) {
     StaticPermutationsAndCombinations s=new StaticPermutationsAndCombinations();
     System.out.println("Static variable   a="+a);
     System.out.println("Instance variable b="+s.b);

    meth1();
    s.meth2();
    s.meth3();
    meth4();

	// 5. static variables is like global variables and is available for all methods
    System.out.println("static variables is like global variables and is available for all methods for ex in meth1() and meth2()");
     

	}
	
	

}

// 4. static variables are shared among all instances of class
class InstanceofStatic extends StaticPermutationsAndCombinations{
	public static void meth4() {
        System.out.println("Static overrided method.");
		System.out.println("All is bad.");
		System.out.println(a);
    }
	
	public static void main(String[] args) {
		System.out.println("static variable of parent class 'StaticPermutationsAndCombinations' is shared with this instance class a:"+a);
		meth4();
	}
}
