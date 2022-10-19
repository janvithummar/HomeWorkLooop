//WAP to find a factorial for given number
// For eg. entered number is 5.

import java.util.Scanner;

public class Factorial5 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        //declare and initialize the variable
        System.out.println("ENTER THE NUMBER");
        int num=scanner.nextInt();
        int i=1,fact=1;
        while (i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("THE FACTORIAL NUMBER......."+fact);
    }
}
