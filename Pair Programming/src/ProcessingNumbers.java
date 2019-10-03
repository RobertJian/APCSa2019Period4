import java.util.*;

public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many times do you want to run your numbers? : ");
		int times = userInput.nextInt();
		System.out.print("what is your first value :");
		int value = userInput.nextInt();
		int max = value; 
		int min = value;
		int evenMax = max; 
		int evenSum = 0;
		if(value%2 == 0) {
			evenSum = value;
			evenMax = value;
		}
		for(int i = 1; i < times; i++) {
			System.out.print("What is your next value? : ");
			int scanValue = userInput.nextInt();
			if(scanValue>max) {
				max = scanValue;
			}else if(scanValue<min){
				min = scanValue;
			}
			if(scanValue%2 ==0) {
				evenSum += scanValue;
				if(scanValue>evenMax) {
					evenMax = scanValue;
				}
			}			
		}
		System.out.println("Biggest number is: " + max);
		System.out.println("Smallest number is: " + min);
		System.out.println("The sum of all even number is " + evenSum + " and the biggest even number is " + evenMax );
		userInput.close();
	}
}
