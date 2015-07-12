/**
 * Created by Ryan on 7/11/2015.
 */

import java.util.Scanner;
public class NumberOfYears {
    public static void main(String[] args){

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for the number

        System.out.println("enter the number of minutes: ");

        double numberOfMinutes = input.nextDouble();

        // Covert minutes to Years

        double numberOfYears = numberOfMinutes / (60 * 24 * 365);
        double remainingMinutes = numberOfMinutes % (60 * 24 * 365);

        double numberOfDays = remainingMinutes / (60 * 24);

        System.out.println("Number of Year: " + (int)numberOfYears);
        System.out.println("Number of Days: " + (int)numberOfDays);
    }
}
