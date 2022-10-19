import java.util.Scanner;

public class Sum10 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CALCULATE SUM OF DIGITS......");
        int number = scanner.nextInt();
        int sum = 0;
        int input = number;
        while (input !=0)// using hear while loop
        {
            int last = input % 10;
            sum += last;
            input /= 10;

        }
        System.out.printf("SUM OF DIGITS OF NUMBER  %d is %d...", number, sum);
        //closing scanner
        scanner.close();
    }

}
