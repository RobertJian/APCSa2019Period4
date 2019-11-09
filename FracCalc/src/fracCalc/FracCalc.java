package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput =  new Scanner(System.in);
    	System.out.println("Enter first expression:");
    	System.out.print(produceAnswer(userInput.nextLine()));
    	

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String[] splitInput = input.split(" ");
    	String operand1 = splitInput[0];
    	String operator = splitInput[1];
    	String operand2 = splitInput[2];
    	int[] frac1 = {0, 0, 1};
    	int[] frac2 = {0, 0, 1};
    	splitFrac(operand1, frac1);
    	splitFrac(operand2, frac2);
    	String answer = "0";
    	int[] improperFrac1 = {0;
    	int improperFrac2 = 0;
    	if (operator.equals("*")) {
    		
    		
    	}
        return "whole:" + frac1[0] + " numerator:" + frac1[1] + " denominator:" + frac1[2];
        
    }
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
   public static void splitFrac(String operand, int[] frac) {
	 if(operand.indexOf("_")!=-1 && operand.indexOf("/")!=-1){
   		String[] mixNum = operand.split("_");
   		frac[0] = Integer.parseInt(mixNum[0]);
   		String[]fraction = mixNum[1].split("/");
   		frac[1] = Integer.parseInt(fraction[0]);
   		frac[2] = Integer.parseInt(fraction[1]);
   	}else if(operand.indexOf("_")==-1 && operand.indexOf("/")!=-1){
   		String[] fraction = operand.split("/");
   		frac[1] = Integer.parseInt(fraction[0]);
   		frac[2] = Integer.parseInt(fraction[1]);
   	}else
   		frac[0] = Integer.parseInt(operand);
   }
   
//   public static void toImproperFrac(int number1, int number2, int number3) {
//		int numerator = number1*number3+number2;
//		int denominator = number3;
//		String answer = numerator+"/"+denominator;
//		if(number3 ==0) {
//			throw new IllegalArgumentException("0 cannot be in the denominator");
//		}
//	
//	}
//   
//	public static String toMixedNum(int number1, int number2) {
//		if(number2==0) {
//			throw new IllegalArgumentException("0 cannot be in the denominator");
//		}
//		int WholeNum = number1/number2;
//		int numerator = number1%number2;
//		int demoninator = number2;
//		String answer = WholeNum +"_"+ numerator + "/"+demoninator;
//		return answer;
//	}
}
