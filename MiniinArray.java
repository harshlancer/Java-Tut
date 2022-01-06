package com.company;

public class MiniinArray {
    public static void main(String[] args) {
        int[]arr={10,3,4,2};
        int ans=Min(arr);
        System.out.println(ans);
    }
    static int Min(int[]arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
