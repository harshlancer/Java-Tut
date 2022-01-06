package com.company;
import java.util.Arrays;
public class BinaryThree {
    public static void main(String[] args) {
        int[]arr={5,7,7,7,7,8,8,10};
        int target=7;
        int[]ans={First(arr,target),Last(arr,target)};
        System.out.println(Arrays.toString(ans));
    }
    static int First(int[]arr,int target)
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
            else if(target<arr[mid] || target==arr[mid])
            {
                end=mid-1;
            }

        }
        return start;
    }
    static int Last(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid] || target==arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
        }
        return end;
    }
}
