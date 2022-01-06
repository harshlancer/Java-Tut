package com.company;

public class HowmanyHavaEvendigitsInArray {
    public static void main(String[] args)
    {
        int[]arr={1,232,45,666,54,23,51};
        System.out.println(findNums(arr));
    }
    static int findNums(int[]arr)
    {
        int count=0;
        for(int num: arr)
        {
            if(digits(num)==true)
            {
                count++;
            }
        }
        return count;

    }
    static boolean digits(int n)
    {
        int nodigits=0;
        for(int num=n;n>0;n/=10)
        {
            nodigits++;
        }
        if(nodigits%2==0)
        {
            return true;
        }
        return false;
    }

}
