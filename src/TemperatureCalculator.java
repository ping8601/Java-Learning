import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out; //only need to enter "out" when printing

/**
* This is Temperature Calculator designed by Elena Hung
*
* Temperature Calculator will calculate the result with 
* the temperature provided by the user.
*
* @author elenahung
* @version 1.0
* @since 01-22-2022
*
* Wrote comments, formatted the code and eliminated need for continue statement
*/

public class TemperatureCalculator {
	// the scanner to be used in all the methods 
	private Scanner readInput = new Scanner(System.in);
	// to store the temperature input by the user
	private int [] weeklyTemp = new int[7];
	// create max, min, and average to store the calculated result
	private int max = 0, min = 0;
	private float total = 0, average;
	
	//create a constructor that does nothing
	public TemperatureCalculator() {	
	}
	
	//Get temperatures
	/**
	 * This method is for asking the user to enter seven temperatures.
	 * 
	 * A while loop is used to continue asking for seven temperatures (int). 
	 * The nextInt method of scanner is used which throws
	 * InputMistatchException if the value is not able to extracted.
	 * When the wrong value is entered, the program will catch the wrong message 
	 * and let the user re-enter. 
	 */
	public void getTemperatures(){
		// to count how many numbers have the user input
		int successful_numbers_read = 0;
		// to stop the loop when loop = false
		boolean loop = true;
		
		out.println("Please enter 7 temperatures for the week, separated by space");
		
		do {
			try {
				successful_numbers_read = 0;
				while(successful_numbers_read < 7) {
					weeklyTemp[successful_numbers_read] = readInput.nextInt();
					successful_numbers_read += 1;
				}//end of while
				loop = false;
			}catch (final InputMismatchException e) {// catch exception for invalid entry
				out.println("You have entered an invalid temperature. Try again.");
				readInput.nextLine(); // discard invalid input
				continue; // keep looping until you you get valid inputs
			}//end of try
		}while(loop);
		
	}//end of method getTemperatures
	
	
	//Print temperatures
	/**
	 * This method is for printing out the temperatures entered by the user.
	 * 
	 * A for loop is used to repeat the printing of 7 temperatures. 
	 */
	public void printTemperatures(){
		for (int i = 0 ; i < 7 ; i++) {
			out.printf("\nThe temperature on day %d was: %d " , i + 1 , weeklyTemp[i]);
		}
	}
	
	//Get max
	/**
	 * This method is for finding out the highest temperature in 7 days.
	 * 
	 * A for loop is used to repeat to compare the integer "max" and 
	 * all 7 temperatures. 
	 */
	public void getMax(){
		max = weeklyTemp[1];
		for(int i = 0 ; i < 7 ; i++) {
			if (weeklyTemp[i] > max) {
				max = weeklyTemp[i];
			}// end of if
		}// end of for loop
	}// end of method getMax
	
	//Get min
	/**
	 * This method is for finding out the lowest temperature in 7 days.
	 * 
	 * A for loop is used to repeat to compare the integer "min" and 
	 * all 7 temperatures. 
	 */
	public void getMin(){
		min = weeklyTemp[1];
		for(int i = 0 ; i < 7 ; i++) {
			if (weeklyTemp[i] < min) {
				min = weeklyTemp[i];
			}// end of if
		}// end of for loop
	}// end of method getMin
	
	//Get average
	/**
	 * This method is for calculating the average temperature in 7 days.
	 * 
	 * A for loop is used to sum up all 7 temperatures and then divide by 7. 
	 */
	public void getAverage(){
		for(int i = 0 ; i < 7 ; i++) {
			total += weeklyTemp[i];
		}// end of for loop
		average = total / 7;
	}//end of method getAverage
	
	//Print statistics
	/**
	 * This method is for printing the outcomes.
	 */
	public void printStatistics(){
		out.printf("\n\nThe Maximum temperature is: %d "
				+ "\nThe Minimum temperature is: %d"
				+ "\nThe Average temperature for the week is: %.2f"
				, max, min, average);
	}//end of method printStatistics
	
	public static void main(String args[]){
		TemperatureCalculator myTemp = new TemperatureCalculator();
		myTemp.getTemperatures();
		myTemp.printTemperatures();
		myTemp.getMax();
		myTemp.getMin();
		myTemp.getAverage();
		myTemp.printStatistics();
	}
	
}
