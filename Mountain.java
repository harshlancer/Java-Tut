package com.company;

public class Mountain {
    public static void main(String[] args)
    {
        int[]arr={0,1,2,4,5,6,8,9,8,6,4,3,1,0};
        System.out.println(ans(arr));
    }
    static int ans(int[]arr)
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
            else if(arr[mid+1]>arr[mid])
            {
                start=mid+1;
            }
        }
        return start;
    }
}
