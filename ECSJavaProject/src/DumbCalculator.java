import java.util.Scanner;
public class DumbCalculator 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double number_1, number_2, number_3;
		
		System.out.println("Let's find the average of a few numbers");
		
		System.out.println("What is the first number? ");
		number_1 = keyboard.nextDouble();
		
		System.out.println("What is the second number? ");
		number_2 = keyboard.nextDouble();
		
		System.out.println("What is the third number? ");
		number_3 = keyboard.nextDouble();
		
		System.out.println("The average of the tree numbers is " + ((number_1 + number_2 + number_3) / 3) + " ");
		
	}

}
