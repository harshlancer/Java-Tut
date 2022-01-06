package com.company;
import java.util.*;
public class LagestOfThree {
    public static void main(String[] args)
    {
        System.out.println("Enter Three numbers: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        Largest(a,b,c);
    }
    static void Largest(int a,int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is Largest");
            }
            else
            {
                System.out.println(b + " is largest ");
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
                System.out.println(b+ " is greatest ");
            }
            else
            {
                System.out.println(c+ " is greatest ");
            }
        }
    }
}
