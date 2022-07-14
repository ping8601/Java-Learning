import java.util.InputMismatchException;
import java.util.Scanner;

public class TroubleShooter {

	public static void getValidChoice() {
		System.out.println("Welcome to sorting program\n\n"
				+ "1. Title\n"
				+ "2. Rank\n"
				+ "3. Date\n"
				+ "4. Stars\n"
				+ "5. Likes\n");
		Scanner readInput = new Scanner(System.in);	
		
		boolean done = false;
		
		while (!done) {
			
			try{
				System.out.printf("Enter your choice between 1 to 5 only: ");
				int x = readInput.nextInt();
				// Make sure x is between 1 to 5
				while (x > 5 || x < 1) {
					System.out.printf("You have entered an invalid choice. Try again.\n"
							+ "Enter your choice between 1 to 5 only: ");
					x = readInput.nextInt();
				}
				done = true;
				
				// Print the successful input
				System.out.println("\nYou entered valid choice " + x + ".\n"
						+ "Thank you for giving your choice.");
			}
			
			// Make sure the user input an int
			catch (InputMismatchException e){
				System.out.println("You have entered an invalid choice. Try again.");
				readInput.next();
			}
			
		}
		System.out.println("----------------------------------------------------------------\n");
	}
	
	
	public static void getValidFloats() {
		System.out.println("Welcome to get two floats program. ");
		Scanner readInput = new Scanner(System.in);	
		
		boolean done = false;
		
		while (!done) {
			
			try{
				System.out.printf("Enter two floats seperated by a space: ");
				float a = readInput.nextFloat();
				float b = readInput.nextFloat();
				done = true;
				
				//Print the successful input
				System.out.printf("\nYou entered two valid floats: %.1f and %.1f\n"
						+ "Thank you for giving two floats.\n",a,b);
			}
			
			// Make sure the user input two floats
			catch (InputMismatchException e){
				System.out.println("You have entered an invalid input. Try again.");
				readInput.next();
			}
			
		}
		System.out.println("----------------------------------------------------------------\n");
	}
	
	public static void findTemperature() {
		int weeklyTemp[] = { 69, 70, 71, 68, 66, 71, 70 };
		int i, max = 0, min = weeklyTemp[0];
		float total = 0, average;
		for (i = 1; i < 8; i++) {
				System.out.printf("The temperature on day %d was %d\n", i, weeklyTemp[i-1]);
				
				if (weeklyTemp[i-1] > max) {
					max = weeklyTemp[i-1];
				}
				
				if (weeklyTemp[i-1] < min) {
					min = weeklyTemp[i-1];
				}
				
				total += weeklyTemp[i-1];
			}
		average = total / (i-1);
		
		System.out.printf("\nThe minimun temperature is: %d\n"
				+ "The maximum temperature is: %d\n"
				+ "The average temperature of the week is: %.5f\n\n"
				+ "Thank you for using my program.", min, max, average);
	}
		
		

	public static void main(String[] args) {

		getValidChoice(); 
		getValidFloats();
		findTemperature();

	}
}

