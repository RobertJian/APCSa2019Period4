/*Robert Jian
 * October 9, 2019
 * 4th
 * to understand the usage of nested loops
 */

public class Hourglass {
	
	public static void line() {
		System.out.print("|");
	}
	public static void quote() {
		System.out.print("\"");
	}
	public static void backslash() {
		System.out.print("\\");
	}
	public static void slash() {
		System.out.print("/");
	}
	public static void colon() {
		System.out.print(":");
	}
	public static void space() {
		System.out.print(" ");
	}
	public static void main(String[] args) {
		int size = 10;
		line();
		for(int quote = 1; quote <= size; quote++) {
			quote();
		}
		line();
		System.out.println();
		for(int line = 1; line <= size/2 - 1; line++) {
			for(int space = 1; space<=line; space++) {
				space();
			}
			backslash();
			for(int colon = 10 - 2*line; colon>=1; colon--) {
				colon();
			}
			slash();
			System.out.println();
	}
		for(int space = 1; space<=size/2; space++) {
			space();
		}
		line();
		line();
		System.out.println();
		for(int line = 1; line <= size/2 -1 ; line++) {
			for(int space = 4; space>=line; space--) {
				space();
			}
			slash();
			for(int colon = 10-2*line; colon<10; colon++) {
				colon();
			}
			backslash();
			System.out.println();
		}
		line();
		for(int quote = 1; quote <= size; quote++) {
			quote();
		}
		line();
}
}