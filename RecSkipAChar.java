package com.company;

public class RecSkipAChar {
    public static void main(String[] args) {
        System.out.print(Skipword("cadappleb"));
    }
    static void Skip(String p,String up)
    {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            Skip(p, up.substring(1));
        } else {
            Skip(p + ch, up.substring(1));
        }
    }
    static String Skipword(String up)
    {
        if(up.isEmpty())
        {
            return up;
        }
        if(up.startsWith("apple"))
        {
            return Skipword(up.substring(5));
        }
        else
        {
            return up.charAt(0)+Skipword(up.substring(1));
        }
    }




    static String Skipchar(String up)
    {
        if(up.isEmpty())
        {
            return up;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            return Skipchar(up.substring(1));
        }
        else
        {
            return ch+ Skipchar(up.substring(1));
        }
    }








//        if(up.isEmpty() )
//        {
//            System.out.println(p);
//            return;
//        }
//        char ch=up.charAt(0);
//        if(ch=='a')
//        {
//            Skip(p,up.substring(1));
//        }
//        else
//        {
//            Skip(p+ch,up.substring(1));
//        }

}
