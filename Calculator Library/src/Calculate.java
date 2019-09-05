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
	//a call to average returns the average for the value passes
		//This average accepts three doubles and returns a double.
	public static double average(double number1, double number2, double number3) {
		double answer = 0;
		answer = (number1 + number2 + number3)/3;
		return answer;
		
	}
	//a call to toDegree converts an angle measure given in radians into degrees.
		//it accepts a double and returns a double.
	public static double toDegrees(double number) {
		double answer = 0;
		answer = number*180/3.14159;
		return answer;
		
	}
	//a call to toRadians converts an angle measure given in degrees into radians.
		//it accepts a double and returns a double.
	public static double toRadians(double number){
		double answer = 0;
		answer = number*3.14159/180;
		return answer;	
	}
	
	//a call to discriminant provides the coefficients of a quadratic equation 
	//in the standard form(a, b, c) and returns the value of the discriminant.
	//it accepts 3 doubles and returns a double.
	public static double discriminant(double a, double b, double c){
		double answer = 0;
		answer = Math.pow(b, 2) - 4*a*c;
		/*if (answer <0 ){
			System.out.println("There is no real roots");} */
		return answer;
	}
	
	//a call to toImproperFrac converts mixed number into an improper fraction
	//the method accepts three integers and returns a string
	//public static String toImproperFrac(WholeNumber, numerator, demoninator) {
		//int answer = 0;
		

}
