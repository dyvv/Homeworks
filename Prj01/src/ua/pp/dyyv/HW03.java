package ua.pp.dyyv;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 0, min = 0;
		System.out.println("Please enter number of hours:");
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt())

			hour = scan.nextInt();
		System.out.println("Number of seconds are:  " + 3600 * hour);
	}

}
