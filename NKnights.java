package com.company;

public class NKnights {
    public static void main(String[] args) {

    }
    static int Knights(boolean [][]board,int row)
    {
        if(row==board.length)
        {
            display(board);
            return 1;
        }
        int count=0;
        //placing and checking knights
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                count+=Knights(board,row+1);
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][]board,int row,int col)
    {
        //check 1
        return true;
    }
    static void display(boolean[][]board)
    {
        for(boolean[] row:board)
        {
            for(boolean element:row)
            {
                if(element)
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.println("X ");
                }
            }
            System.out.println();
        }
    }
}
