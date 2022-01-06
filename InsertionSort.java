package com.company;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={5,3,4,1,2};
        Insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertionsort(int[]arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }
    static void swap(int [] arr,int num1, int num2)
    {
        int temp=num1;
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
}
