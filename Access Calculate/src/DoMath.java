/* Robert Jian
 * August 29, 2019
 * 4th period
 * it is going to call math methods from the Calculate Library aka Client Code - it's going to use that functionality
 */
public class DoMath {

	public static void main(String[] args) {
	//Part 1
		System.out.println(Calculate.square(-11)); 
		System.out.println(Calculate.cube(-2));
		System.out.println(Calculate.average(3, 50));
		System.out.println(Calculate.average(30.4, 82, 94));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(360));
		System.out.println(Calculate.discriminant(3, 8, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 5));
		System.out.println(Calculate.toMixedNum(8, 5));
		System.out.println(Calculate.foil(2, 2 ,2, 2, "x"));
	//Part 2
		System.out.println(Calculate.isDivisbleBy(-129,5));
		System.out.println(Calculate.absValue(101.999));
		System.out.println(Calculate.max(8, 9));
		System.out.println(Calculate.max(90, 100, 101));
		System.out.println(Calculate.min(-11166, 1234));
		System.out.println(Calculate.round2(-38.4250));
	//Part 3
		System.out.println(Calculate.exponent(8,2));
		System.out.println(Calculate.factorial(5));
		
		
	}

}
