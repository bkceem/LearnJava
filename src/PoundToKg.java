/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class PoundToKg {
    public static void main(String[] args){

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for Pound

        System.out.println("Enter the amount of lb: ");

        double pound = input.nextDouble();

        // Covert to kg

        double kilogram = pound * 0.454;

        System.out.println("The kg is " + kilogram);
    }
}
