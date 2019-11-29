public class Main {


    static boolean PermutationsOfStrings(char[] input,  String[] result, int[] count, int level )
    {

        if (level = input.size())
        {
            for(int i=0; i<result.size(); i++)
            {
                System.out.print(result[i]);
            }
        }
        else
        {
            for(int i=0; i<input.size(); i++)
            {
                if (count.get(i)==0)
                {
                    continue;
                }
                else
                {
                    **String word = input.get(i);
                    result[level] = input[i];
                    ***count[i]--;
                    PermutationsOfStrings(input, result, count, level);
                    ***count[i]++;
                }
            }


        }

    }


    public static void main(String[] args)
    {

	    ArrayList<char> input = new  {'A','B','C'};
	    ArrayList<String> result = new ArrayList<String>{5};
        ArrayList<int> count = new ArrayList<int>{5};
        int level=0;


//	    String[] result = new String[];
//	    int[] count= new int[]();
//	    int level=0;

        PermutationsOfStrings(input, result, count, level);

        for(int i= 0; i<result.size(); i++)
        {
            System.out.println(result.get(i));
        }
    }
}

