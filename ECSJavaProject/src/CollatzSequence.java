import java.util.Scanner;
public class CollatzSequence
{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.println("I will now show you 7 numbers with a collatz sequence of any number you choose. ");
   System.out.println("");
   System.out.println("Rules : ");
   System.out.println("If number is even, devide it by two. ");
   System.out.println("If number n is odd, then 3n +1");
   System.out.println("Sequence repeats until n reaches 1");
   System.out.println("");
   System.out.println("Pick a starting number:");
   int entry = input.nextInt();
   System.out.print(entry + "\t");

   while (entry != 1){
     if (entry % 2 == 0){
       entry = entry/2;
       System.out.print(entry + "\t");
     }else if (entry % 2 == 1){
       entry = 3*entry + 1;
       System.out.print(entry + "\t");
     }
   }
  }
}