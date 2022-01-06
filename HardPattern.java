package com.company;

public class HardPattern {
    public static void main(String[] args) {
        Pattern(5);
    }
    static void Pattern(int n)
    {
        for(int i=1;i<=(2*n)-1;i++)
        {
            if(i<=n)
            {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            }
            else if(i>n)
            {
                for(int j=(2*n)-i;j>0;j--)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
