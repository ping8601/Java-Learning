public class TestLetterGrader extends LetterGrader {

/**
* This program TestLetterGrader is designed by Elena Hung
*
* TestLetterGrader inherits the class LetterGrader
* and it is the driver class to use all the methods in LetterGrader.
* 
* @author elenahung
* @version 1.0
* @since 01-30-2022
*
* Wrote comments, formatted the code and eliminated need for continue statement
*/
	//Test letter grader
	/**
	 * This is for setting args as super constructor.
	 */
	public TestLetterGrader(String[] args) {
		super(args);
	}// end of method TestLetterGrader
	
	//Main method
	public static void main(String args[]){
		LetterGrader letterGrader = new LetterGrader(args);
		// if there are not enough arguments, then exit the program
		// continually looping when the use click ENTER
		while(args.length >= 2) {
			letterGrader.readScore(); // reads score and stores the data in member variables
			letterGrader.calcLetterGrade(); // determines letter grade and store information
			letterGrader.printGrade(); // writes the grade in output file
			letterGrader.displayAverage(); // displays the average in console
			letterGrader.doCleanUp(); // cleans all the resources
		}// end of while loop
	}// end of main method
	
}// end of class TestLetterGrader
