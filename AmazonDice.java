package com.company;

public class AmazonDice {
    public static void main(String[] args) {
        Dice("",4);

    }
    static void Dice(String p,int up)
    {
        if( up==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=up;i++)
        {
            Dice(p+i,up-i );
        }
    }
}
