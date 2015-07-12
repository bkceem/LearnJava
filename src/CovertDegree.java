/**
 * Created by Ryan on 7/11/2015.
 */
import java.util.Scanner;
public class CovertDegree {
    public static void main(String[] args){
        // Create a scanner

        Scanner input = new Scanner(System.in);

        // Ask for degree in Celsius

        System.out.println("Enter the degree in Celsius ");
        double celsius = input.nextDouble();

        // Convert to F

        double ferenhiet = (9.0 / 5.0) * celsius + 32;

        System.out.println("The degree in Ferenhiet is " + ferenhiet);



    }
}
