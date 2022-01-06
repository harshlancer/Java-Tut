package com.company;
import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        if(n1==n2){
            System.out.println("Both numbers are equal ");
        }
        else if(n1>n2){
            System.out.println(n1+" is greater than "+ n2);
        }
        else{
            System.out.println(n2+" is greater than "+ n1);
        }

    }
}
