package com.company;

public class BinarySearch {
//    public static void main(String[] args)
//    {
//        int[]arr={2,6,76,84,92};
//        int target=6;
//        int ans=BinarySearch(arr,target);
//        System.out.println(ans);
//    }
//    static int BinarySearch(int[]arr,int target)
//    {
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end)
//        {
//            int mid=start+(end-start)/2;
//            if(target>arr[mid])
//            {
//                start=mid+1;
//            }
//            else if(target<arr[mid])
//            {
//                end=mid-1;
//            }
//            else
//            {
//                return mid;
//            }
//        }
//        return -1;
//    }
public static void main(String[] args) {
    int[]arr={2,43,54,76,89,90,94,100,105,203};
    int target=54;
    int ans=Binary(arr,target);
    System.out.println(ans);
}
static int Binary(int[]arr,int target)
{
    int start=0;
    int end= arr.length-1;
    while(start<=end)
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
        else
        {
            return mid;
        }
    }
    return -1;
}

}
