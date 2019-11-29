import java.util.Scanner;
immport java.util.*;

public class Main {

    static int[] Path_Row = {1, 1, 1, 0, 0, -1, -1, -1};
    static int[] Path_Col = {0, -1, 1, -1, 1, 0, -1, 1};



    private static boolean IfValid(boolean[][] visited, int rowNew, int colNew)
    {
        if((rowNew>=0)&&(rowNew<3)&&(colNew>=0)&&(colNew<3)&&(!(visited[rowNew][colNew])))
        {
            return true;
        }

        return false;

    }

    public static void FindWord(char[][] board, boolean[][] visited, int row, int col, String word, List<String> englishDictionary)
    {
        if (englishDictionary.contains(word))
        {
            englishDictionary.add(word);
        }
        if(board.length == word.length)
        //why */
        {
            return;
        }
        for (int i=0; i< Path_Row.length; i++)
        {
            int rowNew = row + Path_Row[i];
            int colNew = col +Path_Col[i];

            if(IfValid(visited, rowNew, colNew))
            {
                visited[rowNew][colNew]=true;
                FindWord(board, visited, rowNew, colNew, word, englishDictionary);
                visited[rowNew][colNew]=false;

            }


        }

    }


    public static void main(String[] args) {

        char[][] board =
                {
                        {'F','O','B'},
                        {'O','A','E'},
                        {'K','S', 'C'}

                };

        boolean[][] visited =
                {
                        {false, false, false},
                        {false, false, false},
                        {false, false, false}
                };
        String word = "";

        List<String> englishDictionary = new ArrayList<String> ("ACE", "ACES", "BOOK", "BOOKS", "FACE", "FACES", "FACEBOOK");

        for (int row= 0; row<3; row++)
        {
            for (int col=0; col<3; col++)
            {
                visited[row][col]= true;
                FindWord(board, visited, row, col, word, englishDictionary);
                visited[row][col]=false;
            }
        }


        for (int i=0; i<List.length(); i++)
        {
            System.out.println(List[i]);
        }

        Scanner Scan = new Scanner(System.in);
        String input = Scan.nextLine();

    }
}
