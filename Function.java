package com.company;
import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        Sum();
    }
    static void Sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Another number: ");
        int b=sc.nextInt();
        System.out.println("Sum is :"+(a+b));

    }
}
