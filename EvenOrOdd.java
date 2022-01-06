package com.company;
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("Entered number is even ");
        }
        else{
            System.out.println("Entered number is odd ");
        }
    }
}
