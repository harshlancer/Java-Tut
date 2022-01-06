package com.company;

public class Binary {
    public static void main(String[] args) {
        int[]arr={-21,-11,-1,2,3,4,5,6,7,43,65,73,85,100};
        int target=11;
        int ans=BinarySearch(arr,target);
        System.out.println(ans);
    }
    static int BinarySearch(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if (target<arr[mid])
            {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
