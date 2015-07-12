import java.util.Scanner;
public class ComputeVolume {
    public static void main(String[] args){

    // Create a Scanner

        Scanner input = new Scanner(System.in);

        // Ask for Radius and length

        final double pie = 3.1415;

        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.println("Enter the lenght: ");
        double length = input.nextDouble();

        double Volume = radius * radius * pie;
        double Area = Volume * length;

        // Display the result

        System.out.println("The voluem is: " + (int)(Volume * 100) / 100.0);
        System.out.println("The Area is: " + (int)(Area * 100) / 100.0);
    }
}
