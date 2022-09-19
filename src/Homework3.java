import java.util.Scanner;

public class Homework3 {

public static void ageTest() {
		int yourAge;
		Scanner readInput = new Scanner(System.in);
		System.out.printf("How old are you?: ");
		yourAge= readInput.nextInt();
		if (yourAge > 19)
			System.out.printf("You are an adult\n");
		else if (yourAge <= 19 && yourAge >= 13)
			System.out.printf("You are a teenager\n");
		else 
			System.out.printf("You are a kid\n");
		System.out.printf("\n");
	}


	public static void calculator() {			
		String answer = "yes";
		while (answer.equals("yes"))
		{
			double firstN;
			double secondN;
			char operator;
			
			Scanner readInput = new Scanner(System.in);
			System.out.printf("Type a number, operator, number --" + "separated by a space: ");
			
			firstN = readInput.nextDouble();
			operator = readInput.next().charAt(0);
			secondN = readInput.nextDouble();
			
			if (operator == '+')
				System.out.printf("%f + %f = %f", firstN, secondN, firstN + secondN);
			else if (operator == '-')
				System.out.printf("%f - %f = %f", firstN, secondN, firstN - secondN);
			else if (operator == '*')
				System.out.printf("%f * %f = %f", firstN, secondN, firstN * secondN);
			else if (operator == '/')
				System.out.printf("%f / %f = %f", firstN, secondN, firstN / secondN);
			else if (operator == '%')
				System.out.printf("%f %% %f = %f", firstN, secondN,firstN % secondN);
			else
				System.out.printf("Unknown operator");
			

			Scanner readInput2 = new Scanner(System.in);
			System.out.printf("\nDo you want to continue? (yes/no): ");
			answer = readInput2.nextLine();
			System.out.println();
		}
			
	}


	public static void findTheMax() {
		String answer = "y";
		while (answer.equals("y"))
		{
			int max;
			Scanner readInput = new Scanner(System.in);
			System.out.printf("Enter three integer numbers to to find max of them--separated by a space: \n");
			int a = readInput.nextInt();
			int b = readInput.nextInt();
			int c = readInput.nextInt();
			max = (a>b)? a:b;
			max = (max>c)? max:c;
			System.out.print("The max is: " + max);
			System.out.println();
			
			Scanner readInput2 = new Scanner(System.in);
			System.out.print("\nContinue? Type 'y' for yes: ");
			answer = readInput2.nextLine();
			
		}	
	}
	
	

	public static void main(String[] args) {
		ageTest(); 
		calculator(); 
		findTheMax(); 
	}
}

