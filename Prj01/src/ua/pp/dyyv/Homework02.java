package ua.pp.dyyv;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double Cel = 0.0;
		Double Fahr = 0.0;
		int mode = 0;
		System.out.println("Program for converting Celsius to Fahrenheit and vice versa");
		System.out.println("Please choose mode: 1 - from Celsius to Fahrenheit, 2- from Fahrenheit to Celsius  ");
		Scanner scan = new Scanner(System.in);

		if (scan.hasNextInt())

			mode = scan.nextInt();
		if (mode == 1) {
			System.out.println("You've entered Celsius to Fahrenheit mode, please input Celsius value:");
			if (scan.hasNextDouble())

				Cel = scan.nextDouble();
			Fahr = (9 * Cel + 32) / 5;
			System.out.println("Here is Fahrenheit value: " + Fahr);

		}
		if (mode == 2) {
			System.out.println("You've entered  Fahrenheit to Celsius  mode, please input Fahrenheit value:");
			if (scan.hasNextDouble())

				Fahr = scan.nextDouble();
			Cel = 5 * (Fahr - 32) / 9;
			System.out.println("Here is Celsius value: " + Cel);
		}
	}

}
