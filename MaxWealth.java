package com.company;

public class MaxWealth {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {3,5,7},
                {12,54,7},
        };
        int ans=Sum(arr);
        System.out.println(ans);
    }
    static int Sum(int[][]arr)
    {
        int max=0;
        for(int row=0; row< arr.length;row++)
        {
            int sumrow=0;
            for(int col=0;col<arr[row].length;col++)
            {
                sumrow+=arr[row][col];
            }
            if(max<sumrow)
            {
                max=sumrow;
            }
        }
        return max;
    }
}
