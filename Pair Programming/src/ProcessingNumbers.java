import java.util.*;

public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many times do you want to run your numbers? : ");
		int times = userInput.nextInt();
		System.out.print("what is your value 1?: ");
		int value = userInput.nextInt();
		int max = value; 
		int min = value;
		int evenMax = value;
		int evenSum = 0;
		if(value%2==0) {
			evenSum = value;
		}
		for(int i = 2; i <= times; i++) {
			System.out.print("What is your value " + i + "?: ");
			
			int scanValue = userInput.nextInt();
			if(scanValue>max) {
				max = scanValue;
			}else if(scanValue<min){
				min = scanValue;
			}
			if(value%2!=0 && scanValue%2 == 0) {
				evenMax = scanValue;
				evenSum = scanValue;
			}else if(scanValue%2 ==0) {
				evenSum += scanValue;
				if(scanValue>evenMax) {
					evenMax = scanValue;
				}
			}
		}
		System.out.println("The maximum is: " + max);
		System.out.println("the minimum is: " + min);
		System.out.println("The sum of all even number is " + evenSum);
		if(evenMax%2==0 ) {
		System.out.println("The maximum even number is " + evenMax );
		}else if(evenMax == 0){
			System.out.println("The maximum even number is 0.");
		}else {
			System.out.println("There is no even max.");
		}
		userInput.close();
	}
}
