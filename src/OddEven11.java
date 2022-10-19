import java.util.Scanner;

//WAP to input any five digit number and then count total number of odd and even digit and find out
//sum of them
public class OddEven11 {
    public static void main(String[] args) {
        int Number, onedigit = 0,sum=0,even=0,odd=0,sum1=0,sum2=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENETR 5 DIGIT NUMBER");
        Number =scanner.nextInt();
        if (Number>=10000&&Number<=99999)// conditon for sum of five number
        {
            while (Number != 0)// while loop using
            {
                int minder = Number % 10;
                onedigit =onedigit * 10 + minder;
                Number =Number /10;
                sum =sum +minder;
                if (minder % 2== 0){
                    even =even +1;
                    sum1 = sum1 +minder;
                }
                else
                {
                    odd = odd +1;
                    sum2 =sum2 +minder;
                }


        }
            System.out.println("TOTAL EVEN NUMBER ="+even);
            System.out.println("TOTAL ODD NUMBER ="+odd);
            System.out.println("THE SUM OF THE GIVEN NUMBER ="+sum);
            System.out.println("SUM EVEN NUMBER ="+sum1);
            System.out.println("SUM EVEN NUMBER ="+sum2);
        }
    }
}
