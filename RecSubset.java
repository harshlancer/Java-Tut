package com.company;
import java.util.ArrayList;
public class RecSubset {
    public static void main(String[] args) {
//        Sub("","abc");
        ArrayList<String>list=new ArrayList<String>();
        System.out.println(Subst("","abc"));
    }
    static ArrayList<String>Subst(String p,String up)
    {
        ArrayList<String>list = new ArrayList<>();
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>list2=Subst(p,up.substring(1));
        ArrayList<String>list1=Subst(p+ch,up.substring(1));
        list2.addAll(list1);
        return list2;
    }




    static void Sub(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        Sub(p+ch,up.substring(1));
        Sub(p,up.substring(1));
    }
    ArrayList<Integer>list;
    static ArrayList<String> Substring(String p,String up,ArrayList<String>list)
    {
        if(up.isEmpty())
        {
            return list;
        }
        char ch=up.charAt(0);
        Substring(p,up.substring(1),list);

        Substring(p+ch,up.substring(1),list);
        list.add(p+ch);
        return list;
    }

}
