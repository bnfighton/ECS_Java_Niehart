import java.util.Random;

import java.util.Scanner;

public class HiLow2
{
	Scanner keyboard = new Scanner(System.in);
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int tries = 0;
		int random = 1 + r.nextInt(100);
		double actual1 = 0;
		
		System.out.println("Im thinking of a nmber 1-100. ");
		System.out.print("Guess: ");
		actual1 = keyboard.nextInt();
		tries++;

		while ( actual1 != random && tries < 7 )
		{
			if ( random > actual1)
			{
			System.out.println("Sorry, that's too low. ");
			System.out.print("Guess: ");
			actual1 = keyboard.nextInt();
			tries++;
			}
			else if (random < actual1)
			{
				System.out.println("Sorry, that's too high.");
				System.out.print("Guess: ");
				actual1 = keyboard.nextInt();
				tries++;
			}

		if ( actual1 == random )
			System.out.println("Wow! That's right! What are the chances?");
		else if ( tries >= 7 )
			System.out.println("YOU HAVE FAILED!!!!");
		}
}
}
		


