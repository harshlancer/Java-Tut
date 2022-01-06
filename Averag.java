package com.company;

public class Averag {
    public static void main(String[] args) {
        int n=100;
        float sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum/n);
    }
}
