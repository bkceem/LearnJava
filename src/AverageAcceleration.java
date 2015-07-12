/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class AverageAcceleration {
    public static void main(String[] args){

        // Create a scanner

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time: ");

        double t = input.nextDouble();

        System.out.println("Enter the first velocity: ");

        double v0 = input.nextDouble();

        System.out.println("Enter the second velocity: ");
        double v1 = input.nextDouble();

        double averageAccel = (v1 - v0) / t;

        System.out.println("The avg is: " + averageAccel);


    }
}
