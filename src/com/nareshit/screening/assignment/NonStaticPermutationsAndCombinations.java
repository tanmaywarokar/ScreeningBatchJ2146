package com.nareshit.screening.assignment;

public class NonStaticPermutationsAndCombinations {
    int i=10;
	
	// 1. non static variables can be accessed using instance of a class
	public void meth1() {
		System.out.println("non static variables can be accessed using instance of a class 'i':"+new NonStaticPermutationsAndCombinations().i);
	}
	
	// 2. non static variables can not be accessed inside a static method without object of class
	public static void meth2() {
		//following line gives error as without creating object of class we can not access its variables
		//System.out.println("i="+i);
		System.out.println("non static variables can not be accessed inside a static method without object of class 'i':"+new NonStaticPermutationsAndCombinations().i);
	}

	// 3. non static variables do not reduce the amount of memory used by a program
	public void meth3() {
		System.out.println("As non static variables are concerned to object of class they gets initialized after creating object of class only thats why it takes more memory as compared to static variables.");
	}
	
	// 5. non static variable is like a local variable and they can be accessed through only instance of a class
	
	public static void main(String[] args) {

		NonStaticPermutationsAndCombinations n=new NonStaticPermutationsAndCombinations();
		n.meth1();
		meth2();
		n.meth3();	
	}

}

// 4. non static variables are specific to instances of class
class InstanceOfNonStatic extends NonStaticPermutationsAndCombinations{
	public void m1() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		InstanceOfNonStatic obj=new InstanceOfNonStatic();
		obj.m1();
		System.out.println();
	}
}
