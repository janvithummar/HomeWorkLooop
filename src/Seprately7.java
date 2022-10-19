//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

import java.util.Scanner;

public class Seprately7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("\n ENTER DIVIDED NUMBER  3.....");
        number=scanner.nextInt();
        for (int i = 1; i <100 ; i++)
        {

                if (i%3==0) // using 3 divided loop condition
                    System.out.print(i +",");
        }
        Scanner scanner1 = new Scanner(System.in);
        int number1;
        System.out.println("\n\nENTER DIVIDED NUMBER  5....");
        number1=scanner1.nextInt();
        for (int i = 1; i <100 ; i++)
        {
            if (i%5==0)// using 5 divided loop condition
                System.out.print(i + ",");

        }
        System.out.print("\n");
    }

}
