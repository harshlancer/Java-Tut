package com.company;
import java.util.ArrayList;
public class GoogleQuestion {
    public static void main(String[] args) {
        System.out.println(        Key("","12"));
    }
    static void Keypad(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<3*digit;i++)
        {
            char ch=(char)('a'+i);
            Keypad(p+ch,up.substring(1));
        }
    }



    static ArrayList<String> Key(String p,String up)
    {
        ArrayList<String>list=new ArrayList<>();
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(3*digit);i++)
        {
            char ch=(char)('a'+i);
            list.addAll(Key(p+ch,up.substring(1)));

        }
        return list;
    }
}
