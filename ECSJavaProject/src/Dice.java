import java.util.Random;
 
public class Dice
{
	public static void main ( String[] args )
	{
		Random r = new Random();
 
		
		int choice_1 = 1 + r.nextInt(6);
		int choice_2 = 2 + r.nextInt(6);
		
		
		System.out.println("Roll #1:" + choice_1 + "");
		
			

		System.out.println("Roll #2:" + choice_2 + "");
	
		System.out.println( "The total is " + (choice_1 + choice_2)+ " ");
	}
}
