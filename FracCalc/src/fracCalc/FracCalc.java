package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput =  new Scanner(System.in);
    	System.out.println("Enter first expression");
    	System.out.println(produceAnswer(userInput.nextLine()));
    	

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
    //	int wholeNum1 = 0;
    	int wholeNum2 = 0;
    	//int num1 = 0;
    	int num2 = 0;
    	//int dem1 = 1;
    	int dem2 = 1;
    	if(operand2.indexOf("_")!=-1 && operand2.indexOf("/")!=-1){
    		String[] mixNum2 = operand2.split("_");
    		wholeNum2 = Integer.parseInt(mixNum2[0]);
    		String[]fraction = mixNum2[1].split("/");
    		num2 = Integer.parseInt(fraction[0]);
    		dem2 = Integer.parseInt(fraction[1]);
    	}else if(operand2.indexOf("_")==-1 && operand2.indexOf("/")!=-1){
    		String[] fraction = operand2.split("/");
    		num2 = Integer.parseInt(fraction[0]);
    		dem2 = Integer.parseInt(fraction[1]);
    	}else
    		wholeNum2 = Integer.parseInt(operand2);
        return "whole:" + wholeNum2 + " numerator:" + num2 + " denominator:" + dem2;
    }
    


    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
