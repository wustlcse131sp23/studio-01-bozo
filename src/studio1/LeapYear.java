package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		
		boolean divByFour = (year % 4) == 0;
		boolean notDivByHund = (year % 100) != 0;
		boolean DivByFourHund = (year % 400) == 0;
		
		boolean leapYear = divByFour && (notDivByHund || DivByFourHund);
		
		System.out.println(leapYear);
	}

}
