package com.company;

public class MaxinTwoDArray {
    public static void main(String[] args) {
        int[][]arr={
                {1,23,4,6},
                {3,53,655},
                {90,23},
        };
        int asn=max(arr);
        System.out.println(asn);
    }
    static int max(int [][]arr)
    {
        int max=0;
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]>max)
                {
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
