package com.company;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int pro=1;
        for(int i=1;i<=n;i+=1)
        {
               pro=pro*i;
        }
        System.out.println(pro);
    }
}
