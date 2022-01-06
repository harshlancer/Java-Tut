package com.company;

public class RecSumOfDigi {
    public static void main(String[] args) {
        System.out.println(Digit(132432,0));
    }
    static int Digit(int n,int sum)
    {
        if(n<=0)
        {
            return sum;
        }
        sum=sum+n%10;
        return Digit(n/10,sum);
    }
}
