package com.company;

public class OrderAgnostic {
    public static void main(String[] args) {
        int []arr={1,5,7,9,15,18,20,45};
        int []arr2={9,6,4,2,1};
        int target=6;
        int ans=Type(arr2,target);
        System.out.println(ans);
    }
    static int Type(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        if (arr[start]>arr[end])
        {
            return decreasing(arr,target,start,end);
        }
        else return increasing(arr,target,start,end);
    }
    static int increasing(int[]arr,int target,int start,int end)
    {
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else return mid;
        }
        return -1;
    }
    static int decreasing(int [] arr,int target,int start,int end)
    {
            while(start<=end)

            {
                int mid = start+(end-start)/2;
                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else if(target<arr[mid])
                {
                    start=mid+1;
                }
                else return mid;
            }
        return -1;
    }

}
