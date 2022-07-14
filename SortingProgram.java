import java.util.InputMismatchException;
import java.util.Scanner;

/**
* This is Sorting Program designed by Elena Hung
*
* Sorting Program will get ask the user to choose between five choices
* and enter two floats. 
*
* @author elenahung
* @version 1.0
* @since 12-18-2021s
*
* Wrote comments, formatted the code and eliminated need for continue statement
*/

public class SortingProgram {
	
	static float inputFloats[] = {0,0};
	static float answer = 0;
	
	//Choose operator
	/**
	 * @param readInput: Scanner passed from main method.
	 * 
	 * This method is for welcoming the user and 
	 * asking the user to choose one from five choices.
	 * 
	 * A while loop is used to continue asking for an int. 
	 * The nextInt method of scanner is used which throws
	 * InputMistatchException if the value is not able to extracted.
	 * When the wrong value is entered, the program will catch the wrong message 
	 * and let the user re-enter. 
	 * 
	 * Another while loop is used to continue asking for an int between 1 to 5.
	 * When the int enter by the user is bigger than 5 or smaller than 1,
	 * An error message will show and the user will need to re-enter an int.
	 * 
	 */
	
	public static void getUserChoice(Scanner readInput) {
		
		
		//Welcome message and choice
		System.out.println("Welcome to sorting program\n\n"
				+ "1. Title\n"
				+ "2. Rank\n"
				+ "3. Date\n"
				+ "4. Stars\n"
				+ "5. Like\n");
		
		System.out.printf("Enter your choice between 1 to 5 only: ");
			
		int validChoice = 0;
		boolean done = false;
		
		while (!done) {//Loop until we got correct input
			
			try{
				validChoice = readInput.nextInt();
				
				while (validChoice > 5 || validChoice < 1) {//Loop until we got number between 1 to 5
					System.out.printf("You have entered an invalid choice. Try again.\nEnter your choice between 1 to 5 only: ");
					validChoice = readInput.nextInt();
				}
				
				//If you are here you got the correct choice
				done = true;
				System.out.printf("\nYou entered valid choice " + validChoice + "\nThank you for giving your choice\n\n");
				}
			
			//If the user did not enter integer, catch error and ask the user to re-enter
			catch (InputMismatchException e){
				System.out.printf("You have entered an invalid choice. Try again.\nEnter your choice between 1 to 5 only: ");
				readInput.next();
			}
		}
							
			
		}//End of getUserChoice
	
	//Get two floats
	/** 
	 * @param readInput: Scanner passed from main method.
	 * 
	 * This method is for asking the user to enter two floats.
	 * 
	 * A while loop is used to continue asking for two floats. 
	 * The nextFloat method of scanner is used which throws
	 * InputMistatchException if the value is not able to extracted.
	 * When the wrong value is entered, the program will catch the wrong message 
	 * and let the user re-enter. 
	 * 
	 */
	
	public static void getTwoFloats(Scanner readInput) {
		
	
		boolean done = false;
		
		//Welcome message and choice
		System.out.printf("\n\nWelcome to bonus get two floats program\n\nEnter two floats seperated by a space: ");
		
		while (!done) {//Loop until we got correct input
			
			try{
				float a = readInput.nextFloat();
				float b = readInput.nextFloat();
				
				//If you are here you got two floats
				done = true;
				System.out.printf("You entered %.2f and %.2f successfully!\n", a, b);
				
			}
			
			//If the user did not enter floats, catch error and ask the user to re-enter
			catch (InputMismatchException e){
				System.out.printf("You have entered an invalid input. Try again.\nEnter two floats seperated by a space: ");
				readInput.next();
			}
			
		}
	}//End of getTwoFloats
		
	
	

	//Press enter key to continue
	/** 
	 *
	 * This method is for letting the user stop awhile when finish one round of calculation.
	 *
	 * Use try and catch to let the program go forward once the user click enter.
	 * 
	 */
	public static void pressEnterKeyToContinue()
	 { 
	        System.out.println("\nPress enter key to continue...");
	        try
	        {
	            System.in.read();
	        }  
	        catch(Exception e)
	        {}  
	 }//End of pressEnterKeyToContinue

	public static void main(String[] args) {
		//Declare Scanner here and pass to where it is needed.
		Scanner readInput = new Scanner(System.in);
		
		int exit = 0; 
		
		do {//Loop and do not stop
			getUserChoice(readInput);
			getTwoFloats(readInput);
			pressEnterKeyToContinue();
	
		} while (exit == 0);

		
	}//End of main
}//End of class SortingProgram


