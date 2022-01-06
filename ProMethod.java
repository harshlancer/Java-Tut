package com.company;
import java.util.*;
public class ProMethod {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Product(a,b);
    }
    static void Product(int a,int b)
    {
        int p=a*b;
        System.out.println("Product of entered numbers is "+p);
    }
}
