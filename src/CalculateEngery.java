/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;

public class CalculateEngery {

    public static void main(String[] args){

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water: ");

        double amountWater = input.nextDouble();

        System.out.println("Enter the initial temperature: ");

        double initialTemp = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double totalEnergy = amountWater * (finalTemp - initialTemp) * 4184;

        System.out.println("The total Entery: " + totalEnergy);

    }
}
