package com.company;
import java.util.*;
public class SumUser {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
    }
    static void sum(int a,int b)
    {
        int s=a+b;
        System.out.println("Sum of given numbers is "+s);
    }
}
