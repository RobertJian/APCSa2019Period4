package fracCalc;
/*Robert Jian
 * 4th period
 * November 11, 2019
 * to do math on mixed num
 */

import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner userInput =  new Scanner(System.in);
    	String resume;
    	do {
    	System.out.println("Enter expression:");
    	System.out.println(produceAnswer(userInput.nextLine()));
    	System.out.println();
    	System.out.println("Do you want to keep going? (Type \"quit\" to end)");
    	resume = userInput.nextLine();
    	}while (!resume.equals("quit"));
    	userInput.close(); 
    }
    
    public static String produceAnswer(String input) {
    	String[] splitInput = input.split(" ");
    	String operand1 = splitInput[0];
    	String operator = splitInput[1];
    	String operand2 = splitInput[2];
    	int[] mixNum1 = {0, 0, 1};
    	int[] mixNum2 = {0, 0, 1};
    	int[] improperFrac1 = {0, 1};
    	int[] improperFrac2 = {0, 1};
    	splitFrac(operand1, mixNum1);
    	splitFrac(operand2, mixNum2);
    	int[] improperAns = {0, 1};
    	int[] mixAns = {0, 0, 1};
    	toImproperFrac(mixNum1, improperFrac1);
    	toImproperFrac(mixNum2, improperFrac2);
    	if (operator.equals("*")) {
    		improperAns[0] = improperFrac1[0] * improperFrac2[0];
    		improperAns[1] = improperFrac1[1] * improperFrac2[1];
    		toMixedNum(improperAns, mixAns);
    	
    	}
    	if (operator.equals("/")) {
    		improperAns[0] = improperFrac1[0] * improperFrac2[1];
    		improperAns[1] = improperFrac1[1] * improperFrac2[0];
    		toMixedNum(improperAns, mixAns);
    	
    	}
    	if (operator.equals("+")) {
    		if(improperFrac1[1] != improperFrac2[1]) {
    			improperAns[0] = improperFrac1[0]* improperFrac2[1] + improperFrac2[0]* improperFrac1[1];
    			improperAns[1] = improperFrac1[1] * improperFrac2[1];
    		}else{
    		improperAns[0] = improperFrac1[0] + improperFrac2[0];
    		improperAns[1] = improperFrac1[1];
    		}
    		toMixedNum(improperAns, mixAns);
    	}
    		
    	if (operator.equals("-")) {
    		if(improperFrac1[1] != improperFrac2[1]) {
    			improperAns[0] = improperFrac1[0]* improperFrac2[1] - improperFrac2[0]* improperFrac1[1];
    			improperAns[1] = improperFrac1[1] * improperFrac2[1];
    		}else{
    		improperAns[0] = improperFrac1[0] - improperFrac2[0];
    		improperAns[1] = improperFrac1[1];
    		}
    		toMixedNum(improperAns, mixAns);
    	}
    	if(mixAns[0]!= 0 && mixAns[1] !=0) {
    		return mixAns[0] +"_" + mixAns[1] + "/" + mixAns[2];
    	}else if (mixAns[1]!=0){
    		return mixAns[1] + "/" + mixAns[2];
    	}
    		return mixAns[0] +"";
    	}

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
   
   public static void toImproperFrac(int[] mix, int[] impropfrac){
		impropfrac[0] = mix[0]*mix[2]+mix[1];
		if(mix[0]<0) {
			impropfrac[0] = mix[0]*mix[2]-mix[1];
		}
		impropfrac[1] = mix[2];
		if(mix[2]==0) {
			throw new IllegalArgumentException("0 cannot be in the denominator");
		}
	}
   
	public static void toMixedNum(int[] improper, int[] ans) {
		if(improper[1]==0) {
			throw new IllegalArgumentException("0 cannot be in the denominator");
		}
		if(improper[0]<0 && improper[1]<0) {
			improper[0]*=-1;
			improper[1]*=-1;
		}else if(improper[0]>0 && improper[1]<0) {
			improper[0]*=-1;
			improper[1]*=-1;
		}
		ans[0] = improper[0]/improper[1];
		ans[1] = improper[0]%improper[1];
		ans[2] = improper[1];
		simplify(ans);
		if(ans[1]<0 && ans[0]<0) {
			ans[1]*= -1;
		}
	}
	
	public static void simplify(int[] mixedNum) {
		int newNum = mixedNum[1];
		mixedNum[1] /= gcf(newNum, mixedNum[2]);
		mixedNum[2] /= gcf(newNum, mixedNum[2]);
	}
	
	public static int gcf(int num1, int num2) {
		int factor = 1;
		for(int i = 1; i<= Math.abs((Math.min(num1 , num2))); i++){
			if(isDivisibleBy(num1, i)==true && isDivisibleBy(num2 , i)==true) {
				factor = i;}
			}
		if (num1 == 0) {
			factor = num2;
		}else if(num2 ==0) {
			factor = num1;
		}
		return factor;	
	}
	
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

}
