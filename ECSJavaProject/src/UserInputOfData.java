import java.util.Scanner;

public class UserInputOfData
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, last_name, login;
		int grade, student_id;
		Double gpa;
		
		System.out.println("Please give us the following information so we can hack you! ");
		System.out.println("First name: ");
		name = keyboard.next();
		System.out.println("Last name:");
		last_name = keyboard.next();
		System.out.println("Grade: ");
		grade = keyboard.nextInt();
		System.out.println("Student ID: ");
		student_id = keyboard.nextInt();
		System.out.println("Login: ");
		login = keyboard.next();
		System.out.println("GPA: ");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your information: ");
		System.out.println("Login: "+ login + " ");
		System.out.println("ID: "+ student_id + " ");
		System.out.println("Name: "+ name + " " + last_name + " ");
		System.out.println("GPA: "+ gpa + " ");
		System.out.println("Grade: "+ grade + " ");
		
		keyboard.close();
	}
}
