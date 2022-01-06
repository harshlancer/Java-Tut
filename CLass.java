package com.company;
import java.util.Arrays;
public class CLass {
    public static void main(String[] args) {
        int[] rno=new int[5];
        Students[] student =new Students[5];
        Students Harsh=new Students();
//        Harsh.rno=10;
//        Harsh.name="Harsh";
//        System.out.println(Harsh.rno);
        System.out.println(Harsh.name);
    }
}
class Students
{
    int rno;
    String name;
    float marks;
    Students()
    {
        this.rno=54;
        this.marks=88;
        this.name="Harhs";
    }
}
