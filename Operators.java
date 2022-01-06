package com.company;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Product: "+ num1*num2);
        System.out.println("Sum: "+ (num1+num2));
        System.out.println("Defferce "+ (num1-num2));
        System.out.println("Mod "+num1%num2);

    }
}
