/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args){

        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask for the amount of money
        System.out.println("Please enter the amount: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of dollars

        int numberOfDollar = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of Dime

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of Nickels

        int numberOfNickels = remainingAmount / 5;

        remainingAmount = remainingAmount % 5;

        // Find number of cents

        int remainingCents = remainingAmount;

        System.out.println("The number of dollars is " + numberOfDollar);
        System.out.println(" and the number of Quarters is " + numberOfQuarters);
        System.out.println(" and the number of Dime is " + numberOfDimes);
        System.out.println("number of Nickel is " + numberOfNickels);
        System.out.println("and the remaining cent is " + remainingCents);
    }
}
