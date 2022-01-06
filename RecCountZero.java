package com.company;

public class RecCountZero {
    public static void main(String[] args) {
        Count(10200);

    }
    static void Count(int n)
    {
        helper(n,0);
    }
    static void helper(int n,int c)
    {
        if(n<=0)
        {
            System.out.println(c);
            return;
        }
        if(n%10==0)
        {
            c+=1;
        }

        helper(n/10,c);
    }
}
