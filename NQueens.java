package com.company;

import java.util.Scanner;

public class Main {

    public static boolean IfValidCell(boolean[][] board, int rowNew, int colNew, int size)
    {
        int i,j;
        if (rowNew >=8 || colNew >=8 || colNew<0)
        {
            return false;
        }
//        if queen already present then it returns true
        for( i=0; i<size; i++)
        {
            if (board[i][colNew])
            {
                return false;
            }
        }


        /* Check upper diagonal on left side */
        for( i = rowNew, j= colNew; i>=0 && j>=0; i--, j--)

        {
            if(board[i][j])
            {
                return false;
            }

        }



        for(i=rowNew, j= colNew; i>=0 && j<8; i--, j++)
        /*Check the upper diagonal on the right side */
//            same as
        /* Check lower diagonal on left side */
//            for (i=row, j=col; j>=0 && i<N; i++, j--)
        {
            if(board[i][j])
            {
                return false;
            }
        }
        return true;
    }



    public static boolean NQueens(boolean[][] board, int size, int row)
    {
        if (row == size)
        {

            return true;
        }

        else
        {
            for( int col=0; col<=size; col++)
            {
                System.out.print(row+","+col);
                if (IfValidCell(board, row, col, size))
                {
                    board[row][col] = true;
                    System.out.println(" works for now");

                    if (NQueens(board, size, row+1))
                    {
                        return true;
                    }
                    System.out.println(row+", "+col+" backtracking");
                    board[row][col] = false;
                } else {
                    System.out.println(" doesn't work. will backtrack");
                }
            }

        }
        return false;

    }



        public static void main(String[] args)
        {

            boolean [] [] board =
                    {
                    { false, false, false, false, false, false, false, false},
                    { false, false, false, false, false, false, false, false},
                    { false, false, false, false, false, false, false, false},
                    { false, false, false, false, false, false, false, false},
                    { false, false, false, false, false, false, false, false},
                    { false, false, false, false, false, false, false, false},
                    { false, false, false, false, false, false, false, false},
                    { false, false, false, false, false, false, false, false}
                    };

            boolean succeeded = NQueens(board, 8, 0);
            if(succeeded)
            {
                for(int i=0; i<8; i++)
                {
                    for(int j=0; j<8; j++)
                    {
                        System.out.print(board[i][j]);
                        System.out.print(",");

                    }
                    System.out.println();

                }
            }
            Scanner Scan = new Scanner(System.in);
            String input = Scan.nextLine();


        }


}

