import java.util.*;
import java.lang.*;


public class Main {


    private static int num_ways(int n)
    {

        if ((n==0)||(n==1))
        {
            return 1;
        }

        if (n==2)
        {
            return 2;
        }

        else

        {
            return num_ways(n - 1) + num_ways(n - 2);
        }
        // num_ways(n) = num_ways(n-1) + num_ways(n-2);

    }


//    private static int num_ways_X(int n)
//    {}

    public static void main(String[] args)
    {

            int n =4;
            System.out.println(num_ways(n));

    }
}
