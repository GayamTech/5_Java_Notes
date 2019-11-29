import java.util.Scanner;

public class Main {

    static int [] path_Row = {0,0,1,-1};
    static int [] Path_Col = {-1,1,0,0};

    enum Moves {LEFT, RIGHT, UP, DOWN}
    Moves moves;
    path_Row[LEFT] = {0,1}

    public static boolean CanWeMove(int[][] maze, int[][] visited, int row, int col)
    {
        if ((row>=0)&&(row<3)&&(col>=0)&&(col<3)&&(maze[row][col]==1)&&(visited[row][col]==0))
        {
            return true;
        }
        return false;

    }

    public static boolean FindPathInMaze(int[][] maze, int[][] visited, int row, int col, int DestRow, int DestCol, int move)
    {
        if ((row == DestRow) && (col == DestCol))
        {
            for(int i=0; i<4; i++)
            {
                for(int j=0; j<4; j++)
                {
                    System.out.print(visited[i][j]);
                    System.out.print(",");

                }

                System.out.println();
            }
        }
        else
        {
            for(int index=0; index<Path_Row.length; index++)
            {

                int rowNew = row + Path_Row[index];
                int colNew = col + Path_Col[index];

                if (CanWeMove(maze, visited, rowNew, colNew))
                {
                    move++;
                    visited[rowNew][colNew] = move;
                    FindPathInMaze(maze, visited, rowNew, colNew, DestRow, DestCol, move);
                    move--;
                    visited[rowNew][colNew]= 0;

                }

            }

//
        }
            return true;
    }


    public static void main(String[] args) {


	        int [] [] maze = {
                    {1,1,0,1},
                    {0,1,0,1},
                    {0,1,0,1},
                    {0,1,1,1}
            };

	        int [] [] visited = {
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            };

	        visited[0][0]=1;


	        FindPathInMaze(maze, visited, 0,0, 3, 3, 1);

	        Scanner Scan = new Scanner(System.in);
	        String input = Scan.nextLine();

    }
}


