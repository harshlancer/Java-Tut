package com.company;
import java.util.*;
public class MaxByUser {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=Math.max(c,(Math.max(a,b)));
        System.out.println(d);
    }
}
