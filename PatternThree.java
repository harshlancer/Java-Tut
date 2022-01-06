package com.company;

public class PatternThree {
    public static void main(String[] args)
    {
        Pattern2(2);
    }


    static void Pattern2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}