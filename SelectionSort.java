package com.company;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={5,1,4,9,3,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int max=Max(arr,0,last);
            Swap(arr,max,last);
        }
    }
    static int Max(int[]arr,int start,int end)
    {
        int max=start;
        for(int i=0; i<=end;i++)
        {
            if(arr[i]>max)
            {
                max=i;
            }
        }
        return max;
    }
    static void Swap(int[]arr, int max,int last)
    {                   //temp   max    last
        int temp= arr[max]; // 5       5       3
        arr[max]=arr[last];      // 5       3       3
        arr[last]=temp;    //  5       3       5
    }
}
