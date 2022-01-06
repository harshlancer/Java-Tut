package com.company;

public class SearchDecendingArray  {
    public static void main(String[] args) {
        int[]arr={9,5,3,2,1,0};
        int target=5;
        int ans=Binary(arr,target);
        System.out.println(ans);
    }
    static int Binary(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                end=mid-1;
            }
            else if(target<arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
