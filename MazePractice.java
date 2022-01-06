package com.company;

public class MazePractice {
    public  void main(String[] args) {

    }
     void Mazeroute(String p,int r, int c)
    {

    }




     int Maze(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=Maze(r-1,c);
        int right=Maze(c,r-1);
        return left+right;
    }
}
