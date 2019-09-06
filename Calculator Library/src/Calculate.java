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
		return answer;
	}
	
	//a call to toImproperFrac converts mixed number into an improper fraction
	//the method accepts three integers and returns a String.
	public static String toImproperFrac(int number1, int number2, int number3) {
		int numerator = number1*number3+number2;
		int denominator = number3;
		String answer = numerator+"/"+denominator;
		return answer;
	}
	
	//a call to toMixedNum converts improper fraction into a mixed number.
	//the method accepts 2 integers and returns a String.
	public static String toMixedNum(int number1, int number2) {
		int WholeNum = number1/number2;
		int numerator = number1%number2;
		int demoninator = number2;
		String answer = WholeNum +"_"+ numerator + "/"+demoninator;
		return answer;
	}
	
	////a call to foil converts binomial multiplication of the form (ax+b)(cx+d) into a quadratic equation of the form ax^2+bx+c
	//the method accepts four integers and a String and returns a String.
	public static String foil(int a, int b, int c, int d, String variable) {
		int coefficient1 = a*c;
		int coefficient2 = b*c+a*d;
		int coefficient3 = b*d;
		String answer = coefficient1 + variable + "^2" + " + " + coefficient2 + variable + " + " + coefficient3;
		return answer; 
	}
	

}
