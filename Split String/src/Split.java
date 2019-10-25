/*Robert Jian
 * Period 4
 * Use the split method to find out the filling of sandwiches
 */
import java.util.*;
public class Split {
	 public static void main(String[] args) {

		// Your task Part 0

		//String.split();

		//It's a method that acts on a string, <StringName>.split(<sp>);

		//Where sp is the string where the string splits

		//And it returns an array of Strings

		// Example: "I like apples!".split(" ");

		// it will split at spaces and return an array of ["I","like","apples!"]

		// Example 2: "I really like really red apples!".split("really")

		// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

		//play around with String.split!

		//What happens if you "I reallyreally likeapples".split("really") ?
		 	String[] outputArray1 = "I like apples!".split(" ");
		 	System.out.println(Arrays.toString(outputArray1));
		 	
		 	String[] outputArray2 = "I really like really red apples!".split("really");
		 	System.out.println(Arrays.toString(outputArray2));
		 	
		 	String[] outputArray3 = "I really like really red apples!".split(" really ");
		 	System.out.println(Arrays.toString(outputArray3));
		 	
		 	String[] outputArray4 = "really I really like really red apples!".split("really");
		 	System.out.println(Arrays.toString(outputArray4));
		 	
		 	System.out.println(part1("bread"));
		 	System.out.println(part1("mayobreadham"));
		 	System.out.println(part1("mayobread"));
		 	System.out.println(part1("breadmayohamcheesebread"));
		 	System.out.println(part1("breadhambreadeggbread"));
		 	System.out.println(part2("apples pineapples bread lettuce tomato bacon mayo ham bread cheese"));
	 }
	 public static String part1(String sandwich) {
		 	if(sandwich.indexOf("bread")!= -1) {
		 		sandwich = sandwich.substring(sandwich.indexOf("bread"));
		 		if(sandwich.lastIndexOf("bread")!=-1) {
		 			sandwich = sandwich.substring(sandwich.indexOf("bread"), sandwich.lastIndexOf("bread"));
		 			System.out.print(Arrays.toString(sandwich.split("bread")));
		 		}else{
		 			System.out.println("Not a sandwich");
		 		}
		 	}else {
		 		System.out.print("Not a sandwich");
		 	}
		 
		 return "";
		}
	 
		//Your task Part 1:
		/*Write a method that take in a string like
		* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"
		* describing a sandwich.
		* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of
		* the sandwich and ignores what's on the outside
		* What if it's a fancy sandwich with multiple pieces of bread?
	*/
	 public static String part2(String sandwich) {
		 	if(sandwich.indexOf("bread")!= -1) {
		 		sandwich = sandwich.substring(sandwich.indexOf("bread"));
			 	if(sandwich.lastIndexOf("bread")!=-1) {
		 			sandwich = sandwich.substring(sandwich.indexOf("bread"), sandwich.lastIndexOf("bread"));
			 		System.out.print(Arrays.toString(sandwich.split("bread ")));
			 	}else{
			 		System.out.println("Not a sandwich");
			 	}
			}else {
			 	System.out.print("Not a sandwich");
			}
		 	return "";
	 }
			
	//Your task pt 2:
	/*Write a method that take in a string like
	* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"
	* describing a sandwich
	* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of
	* the sandwich and ignores what's on the outside.
	* Again, what if it's a fancy sandwich with multiple pieces of bread?
	*/

}

