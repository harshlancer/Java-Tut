package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleCyclicSortQue {
    public static void main(String[] args)
    {
        int [] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans =Cyclic(arr);
        System.out.println(ans);
    }
    static List<Integer> Cyclic(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i])
            {
                swap(arr,correct,i);
                i++;
            }
            i++;
        }
        List<Integer> ans= new ArrayList<>();
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index] != (index + 1))
            {
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int []arr,int n1,int n2)
    {
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
}
