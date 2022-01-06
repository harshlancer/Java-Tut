package com.company;

import java.util.Arrays;

public class SearchinTwoD {
    public static void main(String[] args) {
        int[][]arr={
                {23,34,56},
                {32,38,59},
                {45,52,62},
        };
        int target=38;
        int []ans=BinarySearch(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] BinarySearch(int[][]arr,int target)
    {
           int row=0;
           int col=arr.length-1;
           while(row<arr.length && col>0)
           {
               if(target==arr[row][col])
               {
                   return new int[]{row ,col};
               }
               if(target<arr[row][col])
               {
                   col--;
               }
               else{
                   row++;
               }
           }
           return new int[]{-1,-1};
    }
}
