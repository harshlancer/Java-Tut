package com.company;
import java.util.*;
public class Circumference {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle ");
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        circm(r);
    }
    static void circm(int r)
    {
        double temp= 2*3.14*r;
        System.out.println("Circumference of circle is "+temp);
    }
}
