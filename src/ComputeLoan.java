/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class ComputeLoan {
    public static void main(String[] args){
        // Create a Scanner

        Scanner input = new Scanner(System.in);

        // Ask for anual interest rate

                System.out.println("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Enter number of  years: ");
        int numberOfYear = input.nextInt();

        System.out.println("Enter the amount of loan: ");

        double amountOfLoan = input.nextDouble();

        double monthlyPayment = amountOfLoan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12));
        double totalPayment = monthlyPayment * numberOfYear * 12;

        System.out.println("The monthly payment is $" + (int) (monthlyPayment / 100) * 100.0);
        System.out.println("The total amount is $" + (int)(totalPayment / 100) * 100.0);




    }
}
