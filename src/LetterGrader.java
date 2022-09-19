import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/**
* This program LetterGrader is designed by Elena Hung
*
* LetterGrader will read the text in input file, calculate the 
* letter grade for the students listed in the input file, save 
* result in another output file,and print out a summary for the 
* students' grade in the console.
*
* @author elenahung
* @version 1.0
* @since 01-31-2022
*
* Wrote comments, formatted the code and eliminated need for continue statement
*/

public class LetterGrader {
	
	// the scanner to be used in all the methods 
	private  Scanner readInput = new Scanner(System.in);
	// for storing the strings in the argument 
	private static String inputFile;
	private static String outputFile;
	// for storing the name of all students and calculation result
	private static List<String> nameList = new ArrayList<String>();
	private static List<List<Integer>> scoreInt = new ArrayList<List<Integer>>();
	private static List<String> letterGrade = new ArrayList<String>();
	private static List<Float> average = new ArrayList<Float>();
	private static List<Integer> maximum = new ArrayList<Integer>();
	private static List<Integer> minimum = new ArrayList<Integer>();
		
	//Letter grader
	/**
	 * This is a constructor for testing if there are two valid arguments. 
	 * 
	 * If and else is used to test if there are two strings in the arguments.
	 * If there are less then two string, then we will use the default value
	 * for the following process.
	 * 
	 */
	public LetterGrader(String[] args) {
		// if less then two strings in the argument
		if (args.length < 2) {
			// then use default value 
			System.out.println("You did not input two auguments. Thank you for using Letter Grader...");
			}
		//otherwise
		else {
			// use the string in the argument
			inputFile = args[0];
			outputFile = args[1];
		}// end of if and else		
	}//end of method LetterGrader
	
	
	//Read score
	/**
	 * This method is for reading the name & score in the input file. 
	 * 
	 * Try is used to test if the input file can be read
	 * FileReader is used to read the file line by line.
	 * The name will be put in nameList and the score will 
	 * be put in scoreInt.
	 * 
	 */
	public void readScore() {
		try {
			// to read a file
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader in = new BufferedReader(fileReader);
			String str; //readLine ¡V read a line into a string
			while ((str=in.readLine()) != null) { //end of file returns null
				
				// spilt the input by comma
				ArrayList<String> temp = new ArrayList<String>(Arrays.asList(str.split(",")));
				// create a list to temporarily store the score
				ArrayList<Integer> tempGrade = new ArrayList<Integer>();
				
				// store the first string in the each line into nameList
				nameList.add(temp.get(0));
				
				// turn the other strings into int and put into tempGrade 
				for(int i = 1 ; i < temp.size() ; i++) {
					tempGrade.add(Integer.valueOf(temp.get(i).trim()));
				}// end of for loop
				
				// add the tempGrade into scoreInt as a two-dimensional list
				scoreInt.add(tempGrade);
				
			}// end of while loop
			// cost the input file
			in.close();
			} catch (Exception e) {
			e.printStackTrace();
			}// end of try
	}// end of method readScore
	
	
	//Calculate letter grade
	/**
	 * This method is for calculating the letter grade for each 
	 * student. 
	 * 
	 * A for loop is used to calculate the average of each student. 
	 * Switch and case is use to give letter grade for each student 
	 * base on their average score.
	 * 
	 */
	public void calcLetterGrade() {
		double tempAverage = 0;
		for(List<Integer> i : scoreInt) {
			// calculate the average of each student
			tempAverage = (i.get(0) + i.get(1) + i.get(2) + i.get(3)) * 0.1 +  i.get(4) * 0.2 + i.get(5) * 0.15 + i.get(6) * 0.25;
			// divide the average score by 10 and round down for switch case
			int quotient = (int) Math.floor(tempAverage) / 10;
			// determine the letter grade of each student base on quotient
			switch (quotient) {
			case 9:
				letterGrade.add("A");
				break;
			case 8:
				letterGrade.add("B");
				break;
			case 7:
				letterGrade.add("C");
				break;
			case 6:
				letterGrade.add("D");
				break;
			default:
				letterGrade.add("F");
		}// end of switch
		}// end of for loop	
	}// end of method calLetterGrade
	
	
	//Print grade
	/**
	 * This method is for printing the grade in output file.
	 * 
	 * A for loop is used to put name and letter grade into a 
	 * TreeMap. Try is used to test if the information can be 
	 * put into the output file. FileWriter is used to write in 
	 * the file line by line.
	 * 
	 */
	public void printGrade() {
		// use TreeMap to map the name and the letter grade for sorting the name
		Map<String, String> namePlusGrade = new TreeMap<String, String>();
		
		// put name and letter grade into the TreeMap namePlusGrade
		for(int i = 0; i < nameList.size(); i++) {
			namePlusGrade.put(nameList.get(i), letterGrade.get(i));
		}// end of for loop
		
		try {
			// to write a new file
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
			out.write("Letter grade for " + nameList.size() + " students given in " + inputFile + " is:\n");
			for (Entry<String, String> entry : namePlusGrade.entrySet()) {
			     out.write(String.format("%1$-25s",entry.getKey() + ":") + entry.getValue() + "\n");
			}// end of for loop
			out.close();
		}catch (Exception e) {
			e.printStackTrace();
		}// end of try
	}// end of method printGrade
	
	
	//Display average
	/**
	 * This method is for displaying average/ maximum/ minimum grades for each test.
	 * 
	 * Two for loop is used to calculate/ find the average/ maximum/ minimum
	 * of each test and add the value into the lists. After that, print out 
	 * all the value in the lists.
	 */
	public void displayAverage() {
		// variables for store the total/ max/ min of each test 
		float total;
		int max;
		int min;

		for(int y = 0; y < 7; y++) {
			// initialize the value of variable before calculation of each test
			total = 0;
			max = scoreInt.get(0).get(y);
			min = scoreInt.get(0).get(y);
			for(int x = 0; x < nameList.size(); x++) { 
				// add all the value into total
				total += scoreInt.get(x).get(y);
				// reset the max only when the value is bigger
				if(scoreInt.get(x).get(y) > max) {
					max = scoreInt.get(x).get(y);
				}// end of if
				// reset the min only when the value is smaller
				if(scoreInt.get(x).get(y) < min) {
					min = scoreInt.get(x).get(y);
				}// end of if
			}// end of for loop
			// add the calculated result into the list
			average.add(total/nameList.size());
			maximum.add(max);
			minimum.add(min);
		}// end of for loop
		System.out.println("Letter grade has been calculated for students listed in the input file "
				+ inputFile + "\nand output in the output file " + outputFile + ".\n");
		System.out.println("\t\tQ1\tQ2\tQ3\tQ4\tMid1\tMid2\tFinal");
		System.out.printf("Average:\t");
		// print all the values in the average list
		for(float i: average) System.out.printf("%.2f\t",i);
		System.out.printf("\nMinumum:\t");
		// print all the values in the minimum list
		for(int i: minimum) System.out.print(i + "\t");
		System.out.printf("\nMaximum:\t");
		// print all the values in the maximum list
		for(int i: maximum) System.out.print(i + "\t");
	}// end of method displayAverage
	
	
	//Do clean up
	/**
	 * This method is for cleaning all the value in the list. 
	 * 
	 */
	public void doCleanUp() {
		System.out.print("\n\nPress ENTER to continue...\n\n");
		// loops until only enter is hit
		while (!readInput.nextLine().equals("")); 
		// clear the value in all the ArrayLists
		nameList.clear();
		scoreInt.clear();
		letterGrade.clear();
		average.clear();
		maximum.clear();
		minimum.clear();
	}// end of method doCleanUp
	
}// end of class LetterGrader
