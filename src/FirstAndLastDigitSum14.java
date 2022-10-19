//WAP to input any five digit number and then find sum of first and last digit

import java.util.Scanner;

public class FirstAndLastDigitSum14 {
    public static void main(String[] args)
    {
        int Number,Digit= 0, sum=0, a=0,b=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ENTER 5 DIGIT NUMBER...");
        Number = scanner.nextInt();
        while (Number !=0)// using while loop
        {
            for (int i=1;i<=5;i++)
            {
                int minder = Number %10;
                Digit = Digit * 10 + minder;
                Number =Number / 10;
                sum=sum+minder;
                if (i==1)
                {
                    b=minder;
                    System.out.println(b);// printout second digit
                    b=b;

                } else if (i == 5)
                {
                    a=minder;
                    a=a;
                    System.out.println(a); // printout first digit
                }
            }
        }
        int total=a+b;
        System.out.println("SUM OF THE 1ST & LAST DIGIT...." +total);
    }
}
