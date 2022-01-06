package com.company;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        Prime(num);
    }
    static void Prime(int suresh)
    {
        int count=0;
        for(int n=suresh-1;n>1;n--)
        {
            if(suresh%n==0){
                count=1;
            }
            else{
                count=0;
            }
        }
        if(count==0)
        {
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
