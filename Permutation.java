package com.company;
import java.util.ArrayList;
import java.sql.SQLOutput;

public class Permutation {
    public static void main(String[] args) {
        System.out.print(AddList("","abc"));

    }
    static ArrayList<String> AddList(String p,String up)
    {
        ArrayList<String>list=new ArrayList<>();
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String a=p.substring(0,i);
            String b=p.substring(i,p.length());
            list.addAll(AddList(a+ch+b,up.substring(1)));

        }
        return list;
    }
}
