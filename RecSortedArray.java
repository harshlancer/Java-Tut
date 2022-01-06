package com.company;

public class RecSortedArray {
    public static void main(String[] args) {
        int []arr={1,3,5,6,8};
        System.out.println(Sorted(arr,0));

    }
    static boolean Sorted(int[]arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index]<arr[index+1])
        {
            return Sorted(arr,index+1);
        }
        return false;
    }
}
