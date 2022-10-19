//WAP to print multiplication table for given number (for loop)

import java.util.Scanner;

public class Table8 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER...");
        int n= scanner.nextInt();
        for (int i = 1; i <=10 ; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);// using table

        }

        }
    }

