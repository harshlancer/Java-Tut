package com.company;
import java.util.Arrays;
public class RecursionQuestion {
    public static void main(String[] args) {
        int [] arr={3,5,1,2,4};

        Expo(4,2,0);
    }
    static void Expo(int n, int a,int x)
    {
        if(n==a)
        {

            return;
        }
        if(x==0)
        {
            if(n==1)
            {
                System.out.println("X is Equal to 0");
                return;
            }
            else
            {
                x+=1;
                Expo(n,a,x);
            }
        }
        for(int i=2;i<=x;i++)
        {
            a=a*a;
        }
    }





    static void Powertwo(int n)
    {
        System.out.println(n*n);
    }



    static void Sum(int n,int sum)
    {

        if(n<=0){
            System.out.println(sum);
            return;
        }

        sum=sum+n+(n-1);
        Sum(n-2,sum);
    }


    static void Prime(int n,int j)
    {
        if(j<=2)
        {
            System.out.println("Number is Prime");
            return;
        }
        if(n%j==0)
        {
            System.out.println("Not Prime");
            return;
        }
        j=j-1;
        Prime(n,j);
    }





    static void BubbleSo(int []arr)
    {
        boolean swapped;
        swapped=false;
            for(int i=1;i< arr.length;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    swap(arr,i,i+1);
                    swapped=true;
                }
                if(swapped=false)
                {
                    break;
                }
            }
    }
    static void swap(int[]arr,int n1,int n2)
    {
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }


    static void ArrayTriangle(int[]arr,int end)
    {
        if(arr.length==1)
        {
            return;
        }
        int [] arr2=new int[end];
        for(int i=0;i<end;i++)
        {
            arr[i]=arr[i]+arr[i+1];
            arr2[i]=arr[i];
        }
        end=end-1;
        System.out.println(Arrays.toString(arr2));
        ArrayTriangle(arr2,end);
    }

}
