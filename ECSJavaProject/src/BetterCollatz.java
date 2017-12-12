import java.util.Scanner;

public class BetterCollatz 
{
    public static void main(String[] args) 
    {
           Scanner keyboard = new Scanner(System.in);

           System.out.print("Starting Number: ");
           int n = keyboard.nextInt();
           int counter = 0;
           int stepsTaken = 0;
           int largestNumber = 0;
           
           
           System.out.println("I will now show you 7 numbers with a collatz sequence of any number you choose. ");
           System.out.println("");
           System.out.println("Rules : ");
           System.out.println("If number is even, devide it by two. ");
           System.out.println("If number n is odd, then 3n +1");
           System.out.println("Sequence repeats until n reaches 1");
           System.out.println("");
           System.out.println("Pick a starting number:");
           
            
            while ( n != 1 ){
                    if ( ( n & 1 ) == 0 ) 
                   {
                           System.out.print( (n = ( n / 2 )) + "  " );
                           stepsTaken++;
                           counter++;
                   }       else 
                   {
                           System.out.print( (n = ( n * 3 ) + 1) + "  " );
                           stepsTaken++;
                           counter++;
                   }
                    
                    

                    if ( n > largestNumber )
                    {
                            largestNumber = n;
                    }
                    
                    

                    if (counter == 9)
                    {
                            counter = 0;
                            System.out.print("\n");
                    }
            }

            System.out.println();
            System.out.println("\nTerminated after " + stepsTaken + " steps.");
            System.out.println("The largest value was " + largestNumber + ".");
    }
}
