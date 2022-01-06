package com.company;

public class SearchInArrays {
    public static void main(String[] args) {
        int[] num={1,2,3,6,5};
        int target=6;
        int ans=search(num,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            int index=arr[i];
            if(index==target)
            {
                return i;
            }
        }
        return 0;
    }
}
