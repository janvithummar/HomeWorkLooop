//WAP to input the 5 digit number and then reverse it

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        System.out.println("ENTER ANY LIKE NUMBER....");
        //SCANNER WILL CAPTURE THE USER INPUT
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();//stored number
        while ( a != 0)// using while loop for reverce number
        {
            b = b *10;
            b = b +a%10;
            a=a/10;
        }
        System.out.println("REVERCE NUMBER IS..."+b);


    }
}
