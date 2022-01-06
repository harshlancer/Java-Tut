package com.company;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        swap(a,b);
    }
    static void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a is " +a);
        System.out.println("Value of b is "+b);
    }
}
