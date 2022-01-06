package com.company;
//Return first missing positive number
public class AmazonQuestionTwo {
    public static void main(String[] args) {
        int []arr={7,8,9,11,12};
        int ans=Binary(arr);
        System.out.println(ans);
    }
    static int Binary(int[]arr)
    {
        int i=0;
        while(i<arr.length) {
            if (arr[i] < arr.length-1) {
                int correct = arr[i] - 1;

                if (arr[i] < 0 || arr[correct] > arr.length) {
                    i++;
                    continue;
                } else if (arr[i] != arr[correct]) {
                    swap(arr, correct, i);
                    i++;
                }
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                return j+1;
            }
        }
        return 0;
    }
    static void swap(int[]arr,int num1,int num2)
    {
        int temp=arr[num1];;
        arr [num1]=arr[num2];
        arr[num2]=temp;
    }
}