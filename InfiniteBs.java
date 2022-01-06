package com.company;

public class InfiniteBs {
    public static void main(String[] args)
    {
        int[]arr={2,3,4,66,89,90,102,106,203,403,503,602,666,70,702,703,705,800,900,1000,1001,2000,2001,2002,2005,2006};
        int target=203;
        System.out.println(ans(arr,target));
    }
    static int ans(int[]arr,int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp=end+1;
            end=end+(end-start+1);
            start=temp;
        }
        return Binary(arr,target,start,end);
    }
    static int Binary(int[]arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=start+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
