package com.company;
import java.util.Arrays;
public class SearchInTwoDArrays {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3,5},
                {5,7,4,3,6},
                {4,2,6,10},
        };
        int target=10;
        int[]ans=Search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Search(int [][]arr,int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0; col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
