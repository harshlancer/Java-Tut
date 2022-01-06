package com.company;

public class Defanging {
    public static void main(String[] args) {
        String str="1.1.1.1";
        String name="Harsh";
        String ans=str(str);
        System.out.println(ans);
    }
    static String str(String str)
    {
        str=str.replace(".","[.]");
        return str;
    }
}
