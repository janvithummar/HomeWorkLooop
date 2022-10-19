import java.util.Scanner;

public class Armstrong13 {
    public static void main(String[] args) {

        int a,arm=0,n,temp;
        //object for scanner class
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER A UNTIL 4 DIGIT NUMBER =");
        n=scanner.nextInt();
        temp=n;
        for (;n!=0;n/=10)
        {
            a=n%10;
            arm=arm+(a*a*a*a);//armstrong condition
        }
        if (arm==temp)
            System.out.println(temp+"\tIS A ARMSTRONG NUMBER");
        else
            System.out.println(temp+ "\tIS A ARMSTRONG NUMVER");


    }
}

