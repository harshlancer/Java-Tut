package com.company;

public class Fabonacci {
    public static void main(String[] args) {
        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        for(int n=1;n<=5; n=n+1)
        {

            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
