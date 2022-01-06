package com.company;
import java.util.*;
public class ArmstronNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        Armstrong(n);
    }
    static void Armstrong(int n){
        int original=n;
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            count=count+(rem*rem*rem);
            n=n/10;
        }

        if(count==original)
        {
            System.out.println("This is an Armstrong Number ");
        }
        else
        {
            System.out.println("It is a WeakStrong number ");
        }
    }
}
