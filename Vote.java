package com.company;
import java.util.*;
public class Vote {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc=new Scanner (System.in);
        int age=sc.nextInt();
        vote(age);

    }
    static void vote(int age)
    {
        if(age>18)
        {
            System.out.println("You can vote ");
        }
        else{
            System.out.println("Grow up ");
    }

    }
}
