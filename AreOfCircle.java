package com.company;
import java.util.Scanner;
public class AreOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius of the cirle ");
        float rad= scanner.nextFloat();
        System.out.println("Area of circle: "+3.14*rad*rad);
        System.out.println("Perimeter of circle: "+2*3.14*rad);
    }
}
