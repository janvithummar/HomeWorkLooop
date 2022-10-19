//Print the sequence for fibonacci series for given limitation n -
// for eg 1 1 2 3 5 8 13 21

import java.util.Scanner;

public class Sequence2 {


    public static void main(String[] args)
    {

        int count = 0,a =0, b = 1;
        System.out.println("HOW MANY NUMBER YOU WANT IN THE SEQUENCE");
        Scanner scanner=new Scanner(System.in);
        count=scanner.nextInt();
         scanner.close();
        System.out.println("FIBONACCi SERIES "+count+"\t NUMBER" );
        int i=1;
        while (i<=count) //using while loop hear
        {
            System.out.print(a + ",");
            int nextTerm = a + b;// calculate the next fibonacci series
            a = b ;
            b = nextTerm ;
            i++;
        }

    }
}
