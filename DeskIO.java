import java.io.*;

/**
* This program DeskIO is designed by Elena Hung
*
* DeskIO will read the text input, organize and print out,
* and save in another file.
*
* @author elenahung
* @version 1.0
* @since 01-24-2022
*
* Wrote comments, formatted the code and eliminated need for continue statement
*/

public class DeskIO {
	// for storing the strings in the argument  
	private static String inputFile;
	private static String outputFile;
	
	// Process CL arguments
	/**
	 * This method is for identifying the input & output file.
	 * 
	 * If and else is used to test if there are two strings in the arguments.
	 * If there are less then two string, then we will use the default value for the following process.
	 */
	public static void processCLArguments(String[] args) {
		// if less then two strings in the argument
		if (args.length < 2) {
			System.out.println("Usage: java DiskIO inputFile outputFile");
			// then use default value 
			inputFile = "input.txt";
			outputFile = "output.txt";
		}
		//otherwise
		else {
			// print out the string in the argument
			System.out.println("Input will be read from:" + args[0]); 
			System.out.println("Output will be written into:" + args[1]);
			// use the string in the argument
			inputFile = args[0];
			outputFile = args[1];
		}// end of if and else		
	}// end of method processCLArguments
	
	
	// Process input output files
	/**
	 * This method is for processing input files and generate output files.
	 * 
	 * Try is used to test if the input file can be read and the output file can be generate.
	 * FileReader is used to read the file and write the file.
	 */
	public static void processInputOutputFiles(String[] args) { 
		// to count the number of the students
		int count = 0;
		System.out.println();
		try {
			// to read a file
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader in = new BufferedReader(fileReader);
			// to write a new file
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
			String s; //readLine ¡V read a line into a string
			while ((s=in.readLine()) != null) { //end of file returns null
				count += 1;
				String[] str = s.split(",");
				System.out.printf("Student #: " + count + " " + str[0]);
				
				out.write("Student #" + count + " is: " + "\"" + str[0] + "\" " + "whose raw scores are: ");
				
				for(int i = 1; i < 8; i++) {
					System.out.printf("," + str[i]);
				
				out.write(str[i] + ":");
				}// end of for loop
				System.out.println();
				out.newLine();
			}// end of while loop
			// close both input file and output file
			in.close();
			out.close();
			} catch (Exception e) {
			e.printStackTrace();
			}// end of try
	}// end of method processInputOutputFiles
	
	// Process the arguments
	/**
	 * This method is for teaching the user how to insert 
	 * the arguments and process the arguments
	 * 
	 */		
	public static void processTheArguments() {
		System.out.printf("\nTo insert the arguments in Eclipse:\n"
				+ "Run ¡÷ Run Configurations... ¡÷ Arguments ¡÷ Program Arguments\n");
		System.out.printf("To process the arguments in Eclipse:\n"
				+ "Click Run after insert the Arguments");
		
	}// end of method processTheArguments
	
	
	public static void main(String[] args) {
		processCLArguments(args);
		processInputOutputFiles(args);
		processTheArguments();
	}
}


