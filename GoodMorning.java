package com.company;
import java.util.Scanner;
public class GoodMorning {
    public static void main(String[] args) {
        System.out.println("Enter number of times print Aditya is a Smart boi: ");

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        Gm(n);

    }
    static void Gm(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Aditya is a Smart Boi");
        }
    }
}
