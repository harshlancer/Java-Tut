package com.company;

public class SearchInMountain {
    public static void main(String[] args) {
        int []arr={1,2,3,5,76,64,43,3,1};
        int target=5;
        int ans=Max(arr,target);
        System.out.println(ans);
    }
    static int Max(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
        }
        return search(arr,target,start);
    }
    static int search(int[]arr,int target,int start)
    {
        int newstart=0;
        int newend=start;
        while(newstart<=newend)
        {
            int mid=newstart+(newend-newstart)/2;
            if(target>arr[mid])
            {
                newstart=mid+1;
            }
            else if(target<arr[mid])
            {
                newend=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
