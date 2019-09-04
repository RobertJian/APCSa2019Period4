/* Robert Jian
 * August 29, 2019
 * 4th period
 * a group of methods that performs math calculations aka library - collections of methods
 */
public class Calculate
{
	//a call to square returns the square of the value passes.
	//it accepts and returns an integer.
	public static int square(int number) {
		int answer = 0; 
		answer = number*number; 
		return answer; 
		
	}
	//a call to cube returns the cube of the value passes.
		//it accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number*number*number;
		return answer;
				
	}
	//a call to average returns the average of the value passes.
		//it accepts 2 doubles and returns a double.
	public static double average(double number1, double number2) {
		double answer = 0;
		answer = (number1+number2)/2;
		return answer;
		
				
	}
}
