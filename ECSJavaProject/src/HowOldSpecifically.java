import java.util.Scanner;

public class HowOldSpecifically 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;
		
		System.out.println("Hey, what's your name? ");
		name = keyboard.next();
		
		System.out.println("Ok, " + name + " how old are you?");
		age = keyboard.nextInt();
		
		if ( age < 16 )
		{
			System.out.println("You can't drive.");
		}
		else if ( age <= 17 || age >= 16 )
		{
			System.out.println("You can drive but not vote.");
		}
		else if ( age <= 24 || age >= 18 )
		{
			System.out.println("You can drive but not vote.");
		}
		if ( age >= 25 )
		{
			System.out.println("You can pretty much do whtever you want.");
			
		}
		
		
	}

}
