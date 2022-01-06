package com.company;
import java.util.Scanner;
public class nthOfFabo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter desired term: ");
        int  n= in.nextInt();
        int count=2;
        int a=0;
        int b=1;
        while(count<=n){
            int temp= a+b;
            System.out.println(temp);
            a=b;
            b=temp;

        }
    }
}
