package com.company;

public class SubsetString {
    public static void main(String[] args) {
        Subset("","abc");

    }
    static void Subset(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        Subset(p+ch,up.substring(1));
        Subset(p,up.substring(1));
    }
}
