/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class FeetToMeters {
    public static void main(String[] args){

        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Ask for feet
        System.out.println("Please enter a value for feet: ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;

        System.out.println("The meter is : " + meter);
    }
}
