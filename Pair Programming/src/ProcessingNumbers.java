import java.util.*;

public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many times do you want to run your numbers? : ");
		int times = userInput.nextInt();
		int max; 
		int min;
		int evenMax = 0;
		int sum = 0;
		for(int i = 1; i <= times; i++) {
			System.out.print("What is your value? : ");
			int value = userInput.nextInt();
			max =value;
			min =value;
			if(value>max) {
				max = value;
			}else if(value<min){
				min = value;
			}
			if(value%2 ==0) {
				sum += value;
				if(value>evenMax) {
					evenMax = value;
				}
			}
			System.out.print(value + " ");
			
		}
		System.out.println("Biggest number is: " + max);
		System.out.println("Smallest number is: " + min);
		System.out.println("The sum of all even number is " + sum + "and the biggest even number is " + evenMax );
		userInput.close();
	}

}
