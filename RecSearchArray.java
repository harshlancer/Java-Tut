package com.company;

public class RecSearchArray {
    public static void main(String[] args)
    {
        int[]arr={1,2,3,4,5,6};
        int target=10;
        System.out.println(Search(arr, target,0));
    }
    static int Search(int []arr,int target,int index)
    {
        if(arr[index]==target)
        {
            return index;
        }
        if(index==arr.length-1)
        {
            return -1;
        }
        return Search(arr,target,index+1);
    }
}
