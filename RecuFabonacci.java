package com.company;

public class RecuFabonacci {
    public static void main(String[] args)
    {
        System.out.println((Fab(8)));
    }
    static int Fab(int n)
    {
        if(n<2)
        {
            return n;
        }
        return Fab(n-1)+Fab(n-2);
    }
}
