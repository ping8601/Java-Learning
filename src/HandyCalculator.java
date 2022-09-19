import java.util.InputMismatchException;
import java.util.Scanner;

/**
* This is Handy Calculator designed by Elena Hung
*
* Handy Calculator will calculate the result with 
* the information provided by the user.
*
* @author elenahung
* @version 1.0
* @since 12-05-2021
*
* Wrote comments, formatted the code and eliminated need for continue statement
*/

public class HandyCalculator {
	
	static float inputFloats[] = {0,0};
	static float answer = 0;
	
	//Choose operator
	/**
	 * @param readInput: Scanner passed from main method.
	 * 
	 * This method is for welcoming the user and 
	 * asking the user to choose one operator.
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
	
	public static int chooseOperator(Scanner readInput) {
		
		//Prepare an array of operators and print the operator the user chose
		String operator[] = { "add", "subtract", "multiply", "divide"};
		
		
		//Welcome message and choice
		System.out.println("Welcome to Elena Hung's Handy Caculator\n\n"
				+ "1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. Multiplication\n"
				+ "4. Division\n"
				+ "5. Exit\n");
		
		System.out.printf("What would you like to do? ");
			
		int validChoice = 0;
		boolean done = false;
		
		while (!done) {//Loop until we got correct input
			
			try{
				validChoice = readInput.nextInt();
				
				while (validChoice > 5 || validChoice < 1) {//Loop until we got number between 1 to 5
					System.out.printf("You have entered an invalid choice. Please re-enter your choice: ");
					validChoice = readInput.nextInt();
				}
				
				//If you are here you got the correct choice
				done = true;
				System.out.println();
				
				if (validChoice != 5) {
					System.out.printf("Please enter two floats to " + operator[validChoice - 1] + ", separated by a space: ");
				}
			}
			
			//If the user did not enter integer, catch error and ask the user to re-enter
			catch (InputMismatchException e){
				System.out.printf("You have entered an invalid choice. Please re-enter your choice: ");
				readInput.next();
			}
			

			
			
			
		}
		return validChoice;
	}//End of chooseOperator
	
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
		
		
		while (!done) {//Loop until we got correct input
			
			try{
				float a = readInput.nextFloat();
				float b = readInput.nextFloat();
				inputFloats[0] = a;
				inputFloats[1] = b;
				
				//If you are here you got two floats
				done = true;
				
			}
			
			//If the user did not enter floats, catch error and ask the user to re-enter
			catch (InputMismatchException e){
				System.out.printf("You have entered invalid floats please re-enter: ");
				readInput.next();
			}
			
		}
	}//End of getTwoFloats
		
	
	//Calculate the answer
	/** 
	 * @param readInput: Scanner passed from main method.
	 *
	 * This method is for calculating the answer.
	 *
	 * Use if and else to calculate the answer with different operators.
	 * Use while loop to ensure the second number should not be 0 when doing division.
	 * 
	 */
	
	public static void calculateTheAnswer(Scanner readInput, int validChoice) {
		
		
		if (validChoice == 1) {
			answer = inputFloats[0] + inputFloats[1];
		}
		else if (validChoice == 2) {
			answer = inputFloats[0] - inputFloats[1];
		}
		else if (validChoice == 3) {
			answer = inputFloats[0] * inputFloats[1];
		}
		else {
			while (inputFloats[1] == 0) {
				System.out.printf("You can¡¦t divide by zero please re-enter both floats:");
				getTwoFloats(readInput);
			}
			answer = inputFloats[0] / inputFloats[1];
		}
		
		//Prepare an array of operators with ing and print the operator the user chose
		String operatorWithIng[] = { "adding", "subtracting", "multiplying", "dividing"};
		//Only division use "by", others use "and"
		String andOrBy[] = { "and", "from", "and", "by"};
		
		//Print out the result, the order of subtracting is different
		if (validChoice == 2) {
			System.out.printf("Result of %s %.2f %s %.2f is %.2f.\n\n", 
					operatorWithIng[validChoice - 1], inputFloats[1], andOrBy[validChoice - 1], inputFloats[0], answer);
		}
		else {
			System.out.printf("Result of %s %.2f %s %.2f is %.2f.\n\n", 
					operatorWithIng[validChoice - 1], inputFloats[0], andOrBy[validChoice - 1], inputFloats[1], answer);
		}
		
			
	}//End of calculateTheAnswer
	
	

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
	        System.out.println("Press enter key to continue...");
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
		
		int opratorNumber = 0; 
		
		do {//Loop until the user enter 5 (Exit)

			opratorNumber = chooseOperator(readInput);
			//Only going forward if the user did not choose 5
			if (opratorNumber != 5) {
				getTwoFloats(readInput);
				calculateTheAnswer(readInput, opratorNumber);
				pressEnterKeyToContinue();
			}
	
		} while (opratorNumber != 5);

		System.out.println("Thank you for using Elena Hung's Handy Calculator");
		
	}//End of main
}//End of class HandyCalculator

