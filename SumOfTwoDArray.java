package com.company;

public class SumOfTwoDArray {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,4},
                {3,5,1},
        };

        Sum(arr);
    }
    static void Sum(int[][]arr)
    {

        for(int row=0; row<arr.length;row++)
        {
            int sum=0;
            for(int col=0;col<arr[row].length;col++)
            {
                sum=sum+arr[row][col];
            }
            System.out.println(sum);

        }
    }
}
