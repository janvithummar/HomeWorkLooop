
//input any number and check if its Palindrome or not?
import java.util.Scanner;

public class Palindrome12 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER....");
        String reverse = "";
        String num = scanner.nextLine();
        int length = num.length();
        for (int i = length - 1; i >= 0; i--)// using for loop
            reverse =reverse + num.charAt(i); //condition for find number palindrome
        if (num.equals(reverse))
            System.out.println("ENETR STRING  IS A PALINDROME");
        else
            System.out.println("THE ENTERED STRING IS NOT PALINDROME");


    }
}
