package com.nareshit.screening.test;

public class MiddleOnePattern {
	
    void display(int n)
    {
       
        int space= n / 2, st = 1;
 
        for (int i = 1; i <= n; i++) {
 
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
 
            int count = st / 2 + 1;
            for (int k = 1; k <= st; k++) {
                System.out.print(count);
                if (k <= st / 2)
                    count--;
                else
                    count++;
            }
 
            System.out.println();
            if (i <= n / 2) {

                space = space - 1;
                st = st + 2;
            }
 
            else {

                space = space + 1;
                st = st - 2;
            }
        }
    }
 
    public static void main(String[] args)
    {
       MiddleOnePattern p = new MiddleOnePattern();
        int n = 7;
        p.display(n);
    }
	   
}
