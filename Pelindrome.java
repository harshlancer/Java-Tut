package com.company;

public class Pelindrome {
    public static void main(String[] args) {
        String str="abccba";
        System.out.println(pel(str));

    }
    static boolean pel(String str)
    {
        for(int i=0; i<str.length()/2;i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
            {
                return false;
            }
        }
        return true;
    }
}
