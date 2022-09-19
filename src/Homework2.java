import java.util.Scanner;

public class Homework2 {

	public static void excercise_2_1() {
		System.out.println("Excercise 2.1");
		int radius = 2;
		double area;
		final double pi = 3.142;
		area= pi * radius * radius;
		System.out.print("The area is: " + area);
	}


	public static void excercise_2_2() {
		Scanner readInput = new Scanner(System.in);
		System.out.println("\n\nExcercise 2.2");
		System.out.print("Enter the radius: ");
		int radius = readInput.nextInt();
		System.out.print("Enter the pi: ");
		double pi = readInput.nextDouble();
		
		double area = pi * radius * radius;
		
		System.out.print("The area is: " + area);	
	}


	public static void excercise_2_3_1() {
		System.out.println("\n\nExcercise 2.3.1");
		final double pi = 3.142;
		System.out.print("Enter the radius: ");
		Scanner readInput = new Scanner(System.in);
		byte newRadius = readInput.nextByte();
		double area= pi * newRadius * newRadius;
		System.out.print("The area is: ");
		System.out.println(area);
		System.out.println();
		System.out.print("What is your first name?: ");
		char yourInitial = readInput.next().charAt(0);
		System.out.println("Hello Mr. " + yourInitial + ".");
	}
	
	public static void excercise_2_3_2() {
		System.out.println("\n\nExcercise 2.3.2");
		System.out.printf("5185 is fun course.\n\n");
		
		System.out.printf("First Name \tLast Name\tCity\n");
		System.out.printf("-----------\t---------\t--- \n");
		System.out.printf("Bill       \tClinton  \tHarlem\n");
		System.out.printf("\n");
		
		System.out.printf("How do you print double quotes?\n");
		System.out.printf("Who said\"Test Scores Can Be Used ....\"\n\n");
		
		Scanner readInput = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String firstName = readInput.nextLine();
		System.out.print("Please enter your last name: ");
		String lastName = readInput.nextLine();		
		System.out.print("Please enter your city: ");
		String city = readInput.nextLine();		
		System.out.print("Please enter your zip code: ");
		int zipCode = readInput.nextInt();
		
		System.out.printf("\nFirst Name \tLast Name\tCity\t\tZip Code\n");
		System.out.printf("----------- \t---------\t----\t\t--------\n");
		System.out .printf("%-16s%-16s%-16s%5d", firstName , lastName, city, zipCode);

	}
	

	public static void main(String[] args) {

		excercise_2_1(); 
		excercise_2_2(); 
		excercise_2_3_1(); 
		excercise_2_3_2(); 

	}
}

