/*Robert Jian
 * 4th Period
 * September 29, 2019
 * a class responsible for the all the calculations.
 */
public class Quadratic {
	
	//a call to isDivisibleBy determines whether or not one integer is evenly divisible by another.
	//the method accepts 2 integers and returns a boolean
		public static boolean isDivisibleBy(int number1, int number2) {
			if (number2==0) {
				throw new IllegalArgumentException("number1 cannot be divided by zero");}
			int i = number1%number2;
			boolean answer; 
			if(i!=0) {
				answer = false;
			}else {
				answer = true;}
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

	//a call to discriminant provides the coefficients of a quadratic equation 
	//in the standard form(a, b, c) and returns the value of the discriminant.
	//it accepts 3 doubles and returns a double.
		public static double discriminant(double a, double b, double c){
			double answer = (b * b) - 4*a*c;
			return answer;
			
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
		
	//a call to absValue returns the absolute value of the number passed
	//the method accepts a double and returns a double
		public static double absValue(double number) {
			double answer = number;
			if(number<0){
				answer = number*(-1);}
			return answer;
			}
			
	//a call to sqrt returns an approximation of the square root of the value passed and round to two decimal places.
	// the method accepts a double and returns a double.
		public static double sqrt(double root) {
			double guess = 1;
			if(root<0) {
				throw new IllegalArgumentException("the root cannot be a negative number");
			}
			while(absValue(root-guess*guess)> 0.00) {
				
			guess = .5*(root/guess+guess);					
			}
			return round2(guess);
		}
		
	//a call to quadForm uses the coefficients of a quadratic equation in standard form and uses the quadratic formula to approximate the real roots, if any.
	//the method accepts 3 integers and returns a string. 
		public static String quadForm(int a, int b, int c) {
			double root1;
			double root2;
			if(discriminant(a,b,c)>0) {
				root1 = ((-b + sqrt(discriminant(a,b,c)))/(2*a));
				root2 = ((-b - sqrt(discriminant(a,b,c)))/(2*a));
				return root1 + " and " + root2;
			}else if(discriminant(a,b,c)==0) {
				root1 = ((-b + sqrt(discriminant(a,b,c)))/(2*a));
				return root1+ " ";
			}
				return "there are no real roots.";
				
		}		
}
