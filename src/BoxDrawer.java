import java.util.Scanner;
import static java.lang.System.out; //only need to enter "out" when printing

/**
* This is Box Drawer designed by Elena Hung
*
* The Box Drawer will draw the box according to
* the width, height, and char provided by the user. 
*
* @author elenahung
* @version 1.0
* @since 01-22-2022
*
* Wrote comments, formatted the code and eliminated need for continue statement
*/

public class BoxDrawer {
	private Scanner readInput = new Scanner(System.in);
	private int height, width;
	private char hChar, vChar;
	private int x, y;
	char answer = 'y';
	
	//create a constructor that does nothing
	public BoxDrawer() {	
	}
	
	//Draw horizontal line
		/**
		 * This method is for drawing the horizontal lines.
		 * 
		 * A for loop is used for drawing the horizontal line that 
		 * the length is equal to the width entered by the user.
		 */
	public void drawHorizontalLine() {
		for (int x = 1 ; x <= width ; x++){
			out.print(hChar);
		}
		out.print("\n");
	}// end of method drawHorizontalLine
	
	//Draw vertical line
	/**
	 * This method is for drawing the vertical lines.
	 * 
	 * Two for loop is used for drawing the vertical line that 
	 * the length is equal to the width entered by the user and repeat until the height is enough.
	 */
	public void drawVerticalLine() {
		for (x = 1 ; x <= height - 2 ; x ++) {
			out.print(vChar);
			for (y = 1 ; y <= width - 2 ; y++) {
			 out.print(" ");	
			}
			out.print(vChar+"\n");
		}
	}// end of method drawVerticalLine
	
	//Draw box
		/**
		 * This method is for drawing the box by asking the user to 
		 * input the length, width and char for drawing the box. 
		 * And then calling the other method to draw the box.
		 */
	public void drawBox() {
		out.print("\nPlease enter height of a box: ");
		height = readInput.nextInt();
		out.print("\nPlease enter width of a box: ");
		width = readInput.nextInt();
		readInput.nextLine();
		
		out.print("\nPlease enter the horizontal charcters to draw box: ");
		hChar = readInput.nextLine().charAt(0);
		out.print("\nPlease enter the vertical charcters to draw box: ");
		vChar = readInput.nextLine().charAt(0);
		
		drawHorizontalLine();
		drawVerticalLine();
		drawHorizontalLine();
	}// end of method drawBox
	
	public static void main(String args[]){
		BoxDrawer box = new BoxDrawer();
		box.drawBox();
	}// end of main method
	
}// end of class BoxDrawer
