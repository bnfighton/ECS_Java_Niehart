public class IfElseOne 
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		if ( cars > people )
		{
			System.out.println("We should take the cars.");
		}
		else if ( cars < people )
		{
			System.out.println("We should not take the cars.");
		}
		else
		{
			System.out.println("We cant decide.");
		}
		if ( buses > cars )
		{
			System.out.println("That's too many buses.");
		}
		else if ( buses < cars )
		{
			System.out.println("Maybe we could take the buses.");
		}
		else
		{
			System.out.println("We still cant decide.");
		}
		
		if ( people > buses )
		{
			System.out.println("All right, let's just take the buses.");
		}
		else 
		{
			System.out.println("Fine lets just stay home then");
		}
		
	}

}
