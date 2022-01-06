package com.company;
import java.util.Scanner;
public class PersonalisedMessage {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner in=new Scanner(System.in);
        String name=in.next();
        personalised(name);

    }
    static void personalised(String name){
        System.out.println("Hello "+name);
    }
}
