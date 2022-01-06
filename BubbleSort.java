package com.company;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={-1,-5,43,-2,100,-34};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[]arr)
    {
        boolean swapped;
        for(int i=0;i< arr.length;i++)
        {
            swapped=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
                if(swapped=false)
                {
                    break;
                }
            }
        }
    }
}
