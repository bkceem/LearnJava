/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class SumTheDigits {

    public static void main(String[] args){

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for the digits
        System.out.println("Please enter the digits: ");
        int digit = input.nextInt();
        // Obtain the first digit
        int firstDigit = digit % 10;
        digit = digit / 10;

        int secondDigit = digit % 10;

        digit = digit / 10;

        int thirdDigit = digit % 10;

        int total = firstDigit + secondDigit + thirdDigit;
        System.out.println("The total is: " + total);
    }
}
