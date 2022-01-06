package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Maze{
    public static void main(String[] args) {
        boolean [][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
                };
        int [][] path=new int[maze.length][maze[0].length];
        Mazeprint("", maze, 0,0,path,1);

    }
    static void Mazeprint(String p, boolean[][]maze,int r, int c,int [][]path,int step)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            for(int []arr: path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1)
        {
            Mazeprint(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1)
        {
            Mazeprint(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0)
        {
            Mazeprint(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0)
        {
            Mazeprint(p+'D',maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0 ;

    }






    static void Mazeall(String p, boolean[][]maze, int r, int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            Mazeall(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            Mazeall(p+'R',maze,r,c+1);
        }
        if(r>0)
        {
            Mazeall(p+'U',maze,r-1,c);
        }
        if(c>0)
        {
            Mazeall(p+'L',maze,r,c-1);
        }
        maze[r][c]=true;
    }


    static void Mazeobstacle(String p,boolean[][]maze,int r, int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        if(r<maze.length-1)
        {
            Mazeobstacle(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            Mazeobstacle(p+'R',maze,r,c+1);
        }
    }
}
