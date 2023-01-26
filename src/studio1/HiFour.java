package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name 1: ");
		String s0 = in.nextLine();
		System.out.print("Enter name two: ");
		String s1 = in.nextLine();
		System.out.print("Enter name three: ");
		String s2 = in.nextLine();
		System.out.print("Enter name four: ");
		String s3 = in.nextLine();
		System.out.println("Hi, " + s0 + ", "+ s1+ ", "+ s2 + ", "+ s3 + ", how's it popping?");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
