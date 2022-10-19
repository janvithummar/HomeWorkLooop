//WAP to enter any String and count total numbers of 'a' in that string

import java.util.Scanner;

public class TotalNumber9 {
    public static void main(String[] args)
    {
        String inputString;
        char Charecter = 'a';
        int count = 0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter string to count charecter....");
        inputString = scanner.next();
        for (int i = 0; i <inputString.length(); i++)
        {
            if (inputString.charAt(i) == Charecter)
            {
                count++;
            }

        }
        System.out.println("\nTHE TOTAL NUMBER OF 'A' IN THE STRING...." +count);
    }
}
