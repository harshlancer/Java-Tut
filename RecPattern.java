package com.company;

public class RecPattern {
    public static void main(String[] args) {
        Pattern(3);
    }
    static void Pattern(int n)
    {
        int temp=n;
        if(n<=0)
        {
            return;
        }
        while(n>0)
        {
            System.out.print("*");
            n-=1;
        }
        System.out.println();
        Pattern(temp-1);
    }

}
