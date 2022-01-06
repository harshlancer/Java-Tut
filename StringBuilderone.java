package com.company;

public class StringBuilderone {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        builder=builder.delete(1,9);
        System.out.println(builder);
    }
}
