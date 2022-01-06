package com.company;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=rem+sum;
            n/=10;
        }
        System.out.println(sum);
    }
}
