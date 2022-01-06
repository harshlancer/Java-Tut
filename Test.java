package com.company;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n=4;
        boolean [][]board=new boolean[n][n];
        System.out.println(isSafe(board,0,0));
    }
    static boolean isSafe(boolean [][]board,int row,int col)
    {
        //verticle check
        for (int i=0; i<row;i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        //diagonal left
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }
        //diagonal right
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++)
        {
            if(board[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }
}
