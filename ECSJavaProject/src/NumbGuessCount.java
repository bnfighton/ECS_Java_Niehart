import java.util.Random;
import java.util.Scanner;

public class NumbGuessCount
{
	public static void main( String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner (System.in);
		int choice_1 = 1 + r.nextInt(6);
		int guess;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it. ");
		System.out.println("Your guess: ");
		guess = keyboard.nextInt();
		
		do
		{
			System.out.println("Thats incorrect. Guess again. ");
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
		}while ( guess != choice_1 );
		System.out.println("Thats right! You're a good guesser. ");
		
	}

}
