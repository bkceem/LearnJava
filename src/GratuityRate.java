/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class GratuityRate {

    public static void main(String[] args){

        // Create Scanner

        Scanner input = new Scanner(System.in);

        // Ask for the amount

        System.out.println("Please enter the amount: ");
        double amount = input.nextDouble();

        double gratuity = amount * 15 / 100.0;

        double totalAmount = amount + gratuity;

        System.out.println("The Gratuity amount is: " + gratuity);
        System.out.println("Th total amount is " + totalAmount);
    }
}
