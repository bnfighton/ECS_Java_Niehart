import java.util.Scanner;

public class TwoQuestions 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String size, item;
		
		
		System.out.println("|  Size / Type              |  Animal  |  Vegitable  |    Mineral  | ");
		System.out.println("|---------------------------|----------|-------------|-------------|");
		System.out.println("| Smaller than a bread box  |  Squirel |  Carrot     |  Paper clip |");
		System.out.println("|---------------------------|----------|-------------|-------------|");
		System.out.println("| Bigger than a breadbox    |  Moose   | watermelon  |    Camaro   |");
		
		System.out.println("Think of a object and i will try to guess it.");
		
		System.out.println("Question 1) Is it an animal, vegitable or mineral?");
		item = keyboard.next();
		
		System.out.println("Question2) Is it bigger than a breadbox?");
		size = keyboard.next();
		
		if (item.equals("animal") )
		{
			if (size.equals("no"))
			System.out.println("It is a squirrel!");
		}
		if (item.equals("animal") )
		{
			if (size.equals("yes"))
			System.out.println("It is a Moose!");
		}
		if (item.equals("vegitable") )
		{
			if (size.equals("no"))
			System.out.println("It is a Carrot!");
		}
		if (item.equals("vegitable") )
		{
			if (size.equals("yes"))
			System.out.println("It is a Watermelon!");
		}
		if (item.equals("Mineral") )
		{
			if (size.equals("no"))
			System.out.println("It is a Paper Clip!");
		}
		if (item.equals("Mineral") )
		{
			if (size.equals("yes"))
			System.out.println("It is a Camero!");
			
		}
	}	
		
}
