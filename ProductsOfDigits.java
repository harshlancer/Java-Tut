package com.company;
import java.util.Scanner;
public class ProductsOfDigits
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i= in.nextInt();
        int p=1;
        while(i>0)
        {
            int rem=i%10;
            p=p*rem;
            i/=10;
        }
        System.out.println(p);
    }


}
