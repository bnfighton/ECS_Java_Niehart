import java.util.Random;
 
public class DoubleDice
{
	public static void main ( String[] args )
	{
		Random r = new Random();
 
		
		int choice_1 = 0;
		int choice_2 = 1;
	
		System.out.println("HERE COMES THE DICE!!");
		
		while ( choice_1 != choice_2 )
		{
			choice_1 = 1 + r.nextInt(6);
			choice_2 = 1 + r.nextInt(6);
			System.out.println("Roll #1:" + choice_1 + "");
			System.out.println("Roll #2:" + choice_2 + "");
		
			System.out.println( "The total is " + (choice_1 + choice_2)+ " ");
			
	
		}
		
			
	}
		
}