
//Print any 10 numbers between given/user input range.
// FOr eg.. between 23-33
import java.util.Scanner;

public class UserRang1 {
    static int rang;
    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);
        System.out.println( "enter 1st number...");

        int a=scanner.nextInt();
        System.out.println("enter 2nd number..." );
        int b= scanner.nextInt();
        // using forLoop hear
        for (int i = a; i <=b ; i++)
        {
                System.out.println("NUMBER....>"+i);

        }
    }
}

