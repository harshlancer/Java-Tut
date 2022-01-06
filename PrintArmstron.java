package com.company;
import java.util.*;
public class PrintArmstron {
    public static void main(String[] args)
    {
        System.out.println("Enter limit of the list ");
        Scanner sc=new Scanner(System.in);
        int limit =sc.nextInt();
        Armstrong(limit);
    }
    static void Armstrong(int limit)
    {

        for(int n=0;limit>=n;n++)
        {
            int count=0;
            int original=n;
            while(n>0)
            {
                int rem=n%10;
                count=count+(rem*rem*rem);
                n=n/10;
            }
            n=original;
            if(count==original)
            {
                System.out.println(original);
            }
        }
    }


}