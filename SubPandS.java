package com.company;
import java.util.Scanner;
public class SubPandS {
    public static void main(String[] args)
    {
        System.out.print("Enter a Number: ");
        Scanner in= new Scanner(System.in);
        int i=in.nextInt();
        int pro=1;
        int sum=0;
        while(i>0)
        {
            int rem=i%10;
            pro=pro*rem;
            sum=sum+rem;
            i/=10;

        }
        System.out.println(pro-sum);
    }
}
