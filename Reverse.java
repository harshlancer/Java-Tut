package com.company;

public class Reverse
{
    public static void main(String[] args)
    {
        int n=546343;
        while(n>0)
        {
            int rem=n%10;
            System.out.print(rem);
            n/=10;
        }
    }
}
