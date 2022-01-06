package com.company;
import java.util.Arrays;
public class RecMaxInArray {
    public static void main(String[] args) {
        int arr[]={5,3,4,2};
        int ans=Max(arr,0);
        System.out.println(ans);
    }
    static int max=0;
    static int Max(int[]arr,int index)
    {
        if(index==arr.length-1)
        {
            return max;
        }
        if(arr[index]>max)
        {
            max=arr[index];
        }
        Max(arr,index+1);
        return max;
    }
}
