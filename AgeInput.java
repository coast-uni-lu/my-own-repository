package lu.uni.scanner;
// Remember to import the class from the appropriate package.
// No worries - you don't need to know these long package names by heart. When you type out the class name `Scanner` in your code, VSC will automatically suggest to import the corresponding package!
import java.util.Scanner;

public class AgeInput {

	public static void main(String[] args) {
		// Initialization of a Scanner object
		Scanner scanner = new Scanner(System.in);
		// System.out.print does not add a newline at the end of your message,
		// as opposed to System.out.println
		System.out.print("Please enter your age: ");

		// Reading a number from standard input - here the console (Terminal)
		int age = scanner.nextInt();

		System.out.println("You are " + age + " years old.");

		// Streams should be closed once you no longer need them!
		scanner.close();
	}

}
