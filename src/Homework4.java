import java.util.Scanner;

public class Homework4 {

	public static void answerTheQuestions() {
		//Question a
		System.out.println("a) How many times this loop is executed?");
		//Answer: 0-9
		System.out.println("Answer: 10");
		//Question b
		System.out.println("b) How many times this loop is executed if we changed the counter increment to ++i?");
		//Answer: 1-9
		System.out.println("Answer: 9");
		//Question c
		System.out.println("c) How many times this loop is executed, if it is executed immediately after the loop in #b, i.e. i is not reinitialized before the loop?");
		//Answer: 0
		System.out.println("Answer: 0");
		
		System.out.println();
	}


	public static void boxUsingLoop() {
		System.out.println("Using loop: ");
		//First horizontal line, Width = 20
		int i = 0;
		while (i++ < 20)
		{
			System.out.print("-");
		}
		System.out.println();
		
		//Vertical lines
		i = 0;
		while (i++ < 10)
		{
			System.out.print("|");
			
			//Center space 20 - 2 = 18
			int j = 0;
			while (j++ < 18)
			{
				System.out.print(" ");
			}
			
			System.out.println("|");
		}
		
		//Second horizontal line, Width = 20
		i = 0;
		while (i++ < 20) 
		{
			System.out.print("-");
		}
		
		System.out.println("\n");
		
	}


	public static void boxUsingDoWhileLoop() {
		System.out.println("Using do while loop: ");
		
		//First horizontal line, Width = 20
		int i = 0;
		do {
			System.out.print("-");
		} while (i++ < 19);//20 minus 1, the first time
		
		System.out.println();
		
		//Vertical lines
		i = 0;
		do {
			System.out.print("|");
		
			//Center space 20 - 2 = 18
			int j = 0;
			do {
				System.out.print(" ");
			} while (j++ < 17);//18 minus 1, the first time
			
			System.out.println("|");
		} while (i++ < 9);//10 minus 1, the first time
		
		//Second horizontal line, Width = 20
		i = 0;
		do {
			System.out.print("-");
		} while (i++ < 19);//20 minus 1, the first time
		
		System.out.println("\n");
	}
	
	public static void boxUsingForLoop() {
		System.out.println("Using for loop: ");
		//First horizontal line, Width = 20
		for (int i = 0; i < 20; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		
		//Vertical lines
		for (int i = 0; i < 10; i++)
		{
			System.out.print("|");
			//Center space 20 - 2 = 18
			for (int j = 0; j < 18; j++)
			{
				System.out.print(" ");
			}
			System.out.println("|");
		}
		//Second horizontal line, Width = 20
		for (int i = 0; i < 20; i++)
		{
			System.out.print("-");
		}
		
		System.out.println("\n");
	}
	
	public static void boxUserInputSize() {
		System.out.println("Using for loop and user input size: \n");
		
		Scanner readInput = new Scanner(System.in);
		//Ask for width
		System.out.printf("Please enter the width of the box: ");
		int w = readInput.nextInt();
		//Ask for height
		System.out.printf("Please enter the height of the box: ");
		int h = readInput.nextInt();
		//Ask horizontal character for drawing box
		System.out.printf("Please enter the horizontal character to draw the box: ");
		char hcar = readInput.next().charAt(0);
		//Ask vertical character for drawing box
		System.out.printf("Please enter the vertical character to draw the box: ");
		char vcar = readInput.next().charAt(0);
		
		System.out.println();
		
		//First horizontal line, Width = w, character = hcar
		for (int i = 0; i < w; i++)
		{
			System.out.print(hcar);
		}
		System.out.println();
		
		//Vertical lines, height = h, character = vcar
		for (int i = 0; i < h; i++)
		{
			System.out.print(vcar);
			//Center space h - 2 
			for (int j = 0; j < w-2 ; j++)
			{
				System.out.print(" ");
			}
			System.out.println(vcar);
		}
		//Second horizontal line, Width = w
		for (int i = 0; i < w; i++)
		{
			System.out.print(hcar);
		}
		
		System.out.println("\n");
			
	}
	
	
	public static void boxAskUser() {
		char answer = 'y';

		while (answer == 'y')
		{
			System.out.println("Using for loop and ask use if want to continue: ");
			
			System.out.println();
			
			Scanner readInput = new Scanner(System.in);
			//Ask for width
			System.out.printf("Please enter the width of the box: ");
			int w = readInput.nextInt();
			//Ask for height
			System.out.printf("Please enter the height of the box: ");
			int h = readInput.nextInt();
			//Ask horizontal character for drawing box
			System.out.printf("Please enter the horizontal character to draw the box: ");
			char hcar = readInput.next().charAt(0);
			//Ask vertical character for drawing box
			System.out.printf("Please enter the vertical character to draw the box: ");
			char vcar = readInput.next().charAt(0);
			
			System.out.println();
			
			//First horizontal line, Width = w, character = hcar
			for (int i = 0; i < w; i++)
			{
				System.out.print(hcar);
			}
			System.out.println();
			
			//Vertical lines, height = h, character = vcar
			for (int i = 0; i < h; i++)
			{
				System.out.print(vcar);
				//Center space h - 2 
				for (int j = 0; j < w-2 ; j++)
				{
					System.out.print(" ");
				}
				System.out.println(vcar);
			}
			//Second horizontal line, Width = w
			for (int i = 0; i < w; i++)
			{
				System.out.print(hcar);
			}
			
			System.out.println("\n");
		
			
			//Ask the user if want to continue
			System.out.printf("Do you want to continue?(y/n) ");
			answer = readInput.next().charAt(0);
			
			System.out.println();
		}	
	}
	

	public static void main(String[] args) {

		answerTheQuestions(); 
		boxUsingLoop(); 
		boxUsingDoWhileLoop(); 
		boxUsingForLoop();
		boxUserInputSize();
		boxAskUser();

	}
}

