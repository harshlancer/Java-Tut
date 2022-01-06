package com.company;
import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.*;
public class ArrayRevision {
    public static void main(String[] args) {
        //fun to check is array is sorted or not
        int []arr={3,2,4,1,4,5,5};

        System.out.println(linearwithoutargument(arr,5,0));

    }
    static ArrayList<Integer> linearwithoutargument(int[]arr, int target, int index)
    {
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length-1)
        {
            if(arr[index]==target)
            {
                list.add(index);
                return list;
            }
            else{
                return list;
            }
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer>list1=linearwithoutargument(arr,target,index+1);
        list.addAll(list1);
        return list;
    }




    static ArrayList<Integer> linearsearchMulti(int[]arr,int target,int index,ArrayList<Integer>list)
    {
        if(index==arr.length-1)
        {
            if(arr[index]==target)
            {
                list.add(index);
                return list;
            }
            else
            {
                return list;
            }
        }
        if(arr[index]==target)
        {
            list.add(index);
            linearsearchMulti(arr,target,index+1,list);
        }
        else{
            linearsearchMulti(arr,target,index+1,list);
        }
        return list;

    }



    static int LinearSearch(int[]arr,int target,int index)
    {
        if(index==arr.length-1)
        {
            if(arr[index]==target)
            {
                return index;
            }
            else{
                return -1;
            }
        }
        if(target==arr[index])
        {
            return index;
        }

        return LinearSearch(arr,target,index+1);



    }






    static void Sorted(int[] arr,int index,int c)
    {
        if(index==arr.length-1)
        {
            return;
        }
        if(index>0 && arr[index]<arr[index-1])
        {
            int temp=arr[index];
            arr[index]=arr[index-1];
            arr[index-1]=temp;
            Sorted(arr,index+1,c);
        }
        if(arr[index]>arr[index+1])
        {
            int temp=arr[index];
            arr[index]=arr[index+1];
            arr[index+1]=temp;
            Sorted(arr,index+1,c);
        }
        else
        {
            Sorted(arr,index+1,c);
        }

    }





    static void Array()
    {
        int[]arr={1,2,3,4,5};
        int [][]array=new int[3][3];
        //input using loops
        Scanner in=new Scanner(System.in);
        for(int i=0; i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                array[i][j]=in.nextInt();
            }
            System.out.println();
        }
        for(int[]a: array)
        {
            System.out.println(Arrays.toString(a));
        }
    }

}
