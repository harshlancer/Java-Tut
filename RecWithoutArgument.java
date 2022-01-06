package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class RecWithoutArgument {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10,2,4,2};
        int target=2;
        System.out.println(Search(arr,target,0));
    }
    static ArrayList<Integer> Search(int[]arr,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer>Newlist= Search(arr,target,index+1);
        list.addAll(Newlist);
        return list;
    }
}
