package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {

        int[]base=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<base.length; i++){
            base[i]=sc.nextInt();
        }
        for(int i=0; i<base.length; i++) {
            System.out.print(base[i]);
        }
        System.out.println();

        int[]sum=new int[3];

        int count=0;

        for(int i=0;i<sum.length;i++)
        {
               count=count+base[i];
               sum[i]=count;
        }

        for(int i=0; i<sum.length; i++){
            System.out.println(Arrays.toString(sum));
        }
    }
}
