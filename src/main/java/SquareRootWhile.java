import java.util.Scanner;
import java.math.*;

public class SquareRootWhile {
    public static void main(String args[])
    {

        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        while (number<0) {
            System.out.print("Invalid Number, Try Again: ");
            number = console.nextInt();


            if (number > 0) {
                System.out.println("The square root of "+number+" is "+Math.sqrt(number));
            }
        }

    }

}
