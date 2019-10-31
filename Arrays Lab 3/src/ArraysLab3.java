import java.util.Arrays;

public class ArraysLab3 {
	/*6) Write a method main that will 

	Contain
	integer arrays a1, a2, sumArr, appendArr, removeArr
	int variables appendNum, removeIdx, sumOfEvens
	Carry out the following actions
	Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) and 
	array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
	Form sumArr by calling the sum method with a1 and a2 as inputs
	Declare int appendNum and set it to 200.
	Form appendArr by calling the append method with a1 and appendNum as inputs
	Declare int removeIdx and set it to 5.
	Form removeArr by calling remove with a2 and removeIdx
	Form sumOfEvens by calling sumEven with appendArr as the input
	Call rotateRight with a1 as the input
	On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
	sumArr
	appendArr
	removeArr
	sumOfEvens (an int you don�t need Arrays.toString)
	a1
	 */
	public static void main(String[] args) {
	int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
	int[] a2 = {7, 14, 21, 28, 35, 42, 49 , 56};
	int[] sumArr = sum(a1, a2);
	int apprendNum =  200;
	int[] apprendArr = append(a1, apprendNum);
	int removeIdx = 5;
	int[] removeArr = remove(a2, removeIdx);
	int sumEvens = sumEven(apprendArr);
	rotateRight(a1);
	System.out.println(Arrays.toString(sumArr));
	System.out.println(Arrays.toString(apprendArr));
	System.out.println(Arrays.toString(removeArr));
	System.out.println(sumEvens);
		
	}
	
//1) Write a method sum that accepts two arrays of integers arr1 and arr2 and returns an array of integers, in which every element is the sum of the elements at that index for the arrays arr1 and arr2. You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sumArray = new int [arr1.length];
		for(int i = 0; i<arr1.length; i++) {
			sumArray[i] = arr1[i] + arr2[i]; 
		}
		return sumArray;
	}


//2) Write a method append that accepts an array of integers arr of length n and an integer num, and returns an array of integers of length n+1 that consists of the elements of arr with num appended to the end.  You can assume array arr has at least one element.

	public static int[] append(int[] arr, int num) {
		int[] apprendedArray = new int[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			apprendedArray[i] = arr[i];
		}
		apprendedArray[apprendedArray.length-1]= num;
		return apprendedArray;
	}

//3) Write a method remove that accepts an array of integers arr and an integer idx and returns an array of integers consisting of all of the elements of arr except for the element at index idx (thus, the returned array has a length of arr.length � 1).  You can assume arr has at least two elements.

	public static int[] remove(int[] arr, int idx) {
		int[] removedArray = new int[arr.length-1];
		for(int i = 0; i<arr.length; i++) {
			if (i<idx) {
				removedArray[i] = arr[i];
			}else if (i > idx) {
				removedArray[i-1] = arr[i];
			}
		}
		return removedArray;
	}

//4) Write a method sumEven that accepts an array of integers arr and returns an integer containing the sum of the elements at the even indices of arr.  (That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.

	public static int sumEven(int[] arr) {
		int sumEven = 0;
		for(int i =0; i<((arr.length+1)/2);i++ ) {
			sumEven += arr[i*2];
		}
		return sumEven;
	}


//5) Write a method rotateRight that accepts an array of integers arr and does not return a value.  The rotateRight method moves each element of arr one index to the right (element 0 goes to element 1, element 1 goes to element 2, �, element n-1 goes to element 0).  You can assume arr has at least one element.

	public static void rotateRight(int[] arr) {
		int last = arr[arr.length-1];
		for(int i = arr.length-1; i>=1; i--) {
			arr[i]= arr[i-1];
		}
		arr[0]=last;
	}

}
