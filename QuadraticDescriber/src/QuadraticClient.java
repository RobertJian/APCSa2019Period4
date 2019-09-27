/*Robert Jian
 * 4th Period
 * September 25, 2019
 * contain a main method and handle interactions with the user. 
 */

import java.util.*;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		String redo;
 	
	do {
		System.out.print("a: ");
		double a = userInput.nextDouble();
		
		System.out.print("b: ");
		double b = userInput.nextDouble();
		
		System.out.print("c: ");
		double c = userInput.nextDouble();
		
		System.out.println();
		
		
		System.out.println(Quadratic.quadrDescriber(a, b, c));
		
	
	 
	 	System.out.println("Do you want to keep going? (Type \"quit\" to end)");
	 	
	 	redo = userInput.nextLine();
	 	
		}while (!userInput.nextLine().equals("quit"));
		System.out.println("Closing Scanner...");
		userInput.close();
	 
	}
	
}
