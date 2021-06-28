package com.nit.screening.lab;

class  StackOverflowDemo
{
    public static void unboundedRecursiveCall() {
     unboundedRecursiveCall();
    }

    public static void main(String[] args) 
    {
        unboundedRecursiveCall();
    }
}