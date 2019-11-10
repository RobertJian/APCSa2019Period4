package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput =  new Scanner(System.in);
    	
    	do {
    	System.out.println("Enter expression:");
    	System.out.println(produceAnswer(userInput.nextLine()));
    	System.out.println("\nDo you want to keep going? (Type \"quit\" to end)");
    	
    	userInput.nextLine();
    	}while (!userInput.nextLine().equals("quit"));
    	userInput.close(); 

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
    	int num = 0;
    	int dem = 1;
    	int wholeNum = 0;
    	int[] frac1 = {0, 0, 1};
    	int[] frac2 = {0, 0, 1};
    	splitFrac(operand1, frac1);
    	splitFrac(operand2, frac2);
    	//String answer = "0";
    	int[] impropFrac1 = {frac1[0]*frac1[2]+frac1[1] ,frac1[2]};
    	int[] impropFrac2 = {frac2[0]*frac2[2]+frac2[1] ,frac2[2]};
    	if (operator.equals("*")) {
    		num = impropFrac1[0] * impropFrac2[0];
    		dem = impropFrac1[1] * impropFrac2[1];
    		wholeNum = num/dem;
    		num = num%dem;
    		if(num%dem!=0) {
    			return wholeNum +"_" + num + "/" + dem;
    		}else {
    			return wholeNum + "";
    		}
    		
    	}
        return "num:" + num + " dem:" + dem;
        
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
   
   public static void toImproperFrac(int[] frac){
	   
		frac[0] = frac[0]*frac[1]+frac[2];
		frac[1] = frac[2];
		String answer = numerator+"/"+denominator;
		if(number3 ==0) {
			throw new IllegalArgumentException("0 cannot be in the denominator");
		}
	}
   
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
