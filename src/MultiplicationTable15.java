//Printing out multiplication table using DO WHILE loop
import java.util.Scanner;

public class MultiplicationTable15 {
    public static void main(String[] args)
    {
        int row, colum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ROW LANGTH");
        row=scanner.nextInt();
        System.out.println("ENTER COLUM HEIGHT");
        colum=scanner.nextInt();
        int i=1;
        do {
            int j = 1;
            do {
                System.out.print(i * j + "\t");
                j++;
            }
            while (j <= colum);
            i++;
            System.out.println();
        }while (i<=row);

    }
}
