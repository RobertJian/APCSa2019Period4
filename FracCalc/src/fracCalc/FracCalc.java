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
    	String num1="0";
    	String num2="0";
    	String dem1="1";
    	String dem2="1";
    	if(operand1.length==1 && operand1[0].indexOf("/")!=-1){
    		String[]fraction = operand1[1].split("/");
    		num1 = fraction[0];
    		dem1 = fraction[1];
    		
    		
    	}
        return num1;
    }
    


    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
