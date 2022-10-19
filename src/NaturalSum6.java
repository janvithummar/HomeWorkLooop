//WAP to display sum of n Natural number

import java.util.Scanner;

public class NaturalSum6 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num;
        //declare the number

        System.out.println("ENTER THE NUMBER....");
        num=scanner.nextInt();// initialize the number

        int sum=0; // sum calculation
        for (int i = 1; i <=num ; i++)
        {
            sum=sum+i;
        }
        System.out.println("SUM OF NATURAL NUMBER\t" +sum);
    }
}
