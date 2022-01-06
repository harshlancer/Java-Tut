package com.company;

public class Questions {
    public static void main(String[] args)
    {
        String[]arr={"b","bb","bbb"};
        String[]arr2={"a","aa","aaa"};
        int ans=chk(arr,arr2);
        System.out.println(ans);
    }
    static int chk(String[]arr,String[]arr2)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr2.length;j++)
            {
                if(arr[i]==arr2[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
