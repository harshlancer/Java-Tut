package com.company;

public class AmazonQuestion {
    public static void main(String[] args) {
        int [] nums={0,1,3};//Question is return the missing number
        int ans=Cyclic(nums);
        System.out.println(ans);
    }
    static int Cyclic(int[]arr)
    {
        int i=0;

        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]==0)
            {
                i++;
                continue;
            }
            else {
                if(arr[i]!=arr[correct])
                {
                    swap(arr,i,correct);
                }
                else i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==0)
            {
                return j+1;
            }
        }
        return -1;
    }
    static void swap(int []arr,int n1,int n2)
    {
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
}
