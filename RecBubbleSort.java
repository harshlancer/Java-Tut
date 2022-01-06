package com.company;
import java.util.Arrays;
public class RecBubbleSort {
    public static void main(String[] args) {
        int[]arr={5,3,4,2};
        SelectionSort(arr,0);
    }
    static void SelectionSort(int[]arr,int index)
    {
        if(index==arr.length-1)
        {
            System.out.println(Arrays.toString(arr));

            return;
        }
        int max=Max(arr,index);
        if(max==arr[arr.length-index-1])
        {
            SelectionSort(arr,index+1);
        }
        else
        {
            int temp=arr[arr.length-index-1];
            arr[arr.length-index-1]=arr[index];
            arr[index]=temp;
            SelectionSort(arr,index+1);

        }
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
