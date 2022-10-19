import java.util.Scanner;

//WAP to check if given number is Prime number or not?

public class PrimeNumber3 {
    public static void main(String[] args)
    {
        int num,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER HEAR....");
        num = scanner.nextInt();
        b=1;
        c=0;
        while (b<=num) // using while loop
        {
            if ((num % b) == 0)
                c = c + 1;
            b++;
        }

        if (c==2)
            System.out.println(num + "\tIS A PRIME NUMBER..");
        else
            System.out.println(num + "\t IS NOT PRIME NUMBER");

    }

}
