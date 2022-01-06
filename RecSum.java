package com.company;

public class RecSum {
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
    static int Sum(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return n+Sum(n-1);
    }
}
