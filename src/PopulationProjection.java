import java.util.Scanner;

public class PopulationProjection {

	public static void main(String[] args) {
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of years: ");
		
		double numberOfYears = input.nextDouble();
		
		double currentPopulation = 312032486;
		
		// Calculate seconds
		
		double numberOfSeconds = numberOfYears * 60 * 60 * 24 * 365.0;
		
		// Calculate the baby born
		
		double numberOfBirth = numberOfSeconds / 7.0;
		
		double numberOfDeath = numberOfSeconds / 13.0;
		
		double numberOfImmigration = numberOfSeconds / 45.0;
		
		double totalPopulation = currentPopulation + numberOfBirth - numberOfDeath + numberOfImmigration;
		
		System.out.println("The Population in " + numberOfYears + " is " + (int)totalPopulation);
		
		
	
	}

}
