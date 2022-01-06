package com.company;
import java.util.Arrays;
import java.util.ArrayList;

public class RecReturnList {
    public static void main(String[] args) {
        int[]arr={1,3,2,42,43,55,43,43,43};
        int target=43;
        System.out.println((Search(arr,target,0,new ArrayList<>())));
    }
    static ArrayList<Integer> Search(int[]arr,int target,int index,ArrayList<Integer>list){
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return Search(arr,target,index+1,list);
    }
}
