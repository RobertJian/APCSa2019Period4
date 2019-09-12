/* Robert Jian
 * August 29, 2019
 * 4th period
 * a group of methods that performs math calculations aka library - collections of methods
 */
public class Calculate
{
   //Part 1	

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
	
	//a call to foil converts binomial multiplication of the form (ax+b)(cx+d) into a quadratic equation of the form ax^2+bx+c
	//the method accepts four integers and a String and returns a String.
	public static String foil(int a, int b, int c, int d, String variable) {
		int coefficient1 = a*c;
		int coefficient2 = b*c+a*d;
		int coefficient3 = b*d;
		String answer = coefficient1 + variable + "^2" + " + " + coefficient2 + variable + " + " + coefficient3;
		return answer; 
	}
	
   //Part 2
	
	//a call to isDivisibleBy determines whether or not one integer is evenly divisible by another.
	//the method accepts 2 integers and returns a boolean
	public static boolean isDivisbleBy(int number1, int number2) {
		int i = number1%number2;
		boolean answer; 
		if(i!=0) {
			answer = false;
		}else {
			answer = true;}
		return answer;
		
		}
	
	//a call to absValue returns the absolute value of the number passed
	//the method accepts a double and returns a double
	public static double absValue(double number) {
		double answer = number;
		if(number<0){
			answer = number*(-1);}
		return answer;
		}
		
	//a call to max returns the larger of the values passed.
	//the method accepts two double and returns a double.
	public static double max(double value1, double value2) {
		double max = value1;
		if(value1<value2) {
			max = value2;}
		return max;
	}
	
	//a call to max returns the larger of the values passed.
	//the method accepts three double and returns a double.
		public static double max(double value1, double value2, double value3) {
			double max = value3;
			if(value3<value1) {
				if(value2<value1) {
					max = value1;
				}else
					max = value2;}
			return max;
		}
		
	//a call to min returns the smaller of the values passed.
	//the method accepts two integers and returns an int.
		public static int min(int value1, int value2) {
			int min = value2;
			if(value1<value2) {
				min = value1;}
			return min;
			}
		
	//a call to round2 rounds a double correctly to 2 decimal places and returns a double.
		public static double round2(double value) {
			double round = value;
			if(value>=0) {
			round = (int)((round+0.005)*100);
			round = (double)(round/100);
			}else{
			round = (int)((value-.005)*100);
			round = (double)(round/100);}
			return round;
			
		}
		
   //Part 3
		
	//a call to exponent raises a value to a positive integer power.
	//the method accepts a double and an int and returns a double.
		public static double exponent(double base, int power) {
			double exponent = base;
			for(int i= 1; i<power; i++) {
				exponent *= base;} //this makes sense because each loop with execute until the power is less than i meaning that the exponent will multiple by itself until the test is false
			if(power == 0) {
				exponent = 1;}
			return exponent;
			}
		
	//a call to factorial returns the factorial of the value passed
	//the method accepts an int and returns an int.
		public static int factorial(int n) {
			int factorial = 1;
			for(int i=2; i<=n; i++) {
				factorial = factorial * i;} //each loop multiply by i+1 so its like 1*2*3*4 until it stops
			return factorial;
			}
		
}
	



