package ua.pp.dyyv;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0, oper = 0, result = 0;
		String operation = null;
		System.out.println("This is a simple calculator.\n  Please enter the first number:");

		if (scan.hasNextInt())

			a = scan.nextInt();

		System.out.println("Please enter the second number:");
		if (scan.hasNextInt())

			b = scan.nextInt();

		System.out.println("Please enter operation: \"plus\" or \"minus\" or \"multiply\" or \"divide\"");

		if (scan.hasNext()) {

			operation = scan.next();

		}

		if (operation.equals("plus")) {
			oper = 1;
		} else {
			if (operation.equals("minus")) {
				oper = 2;
			} else {
				if (operation.equals("multiply")) {
					oper = 3;
				} else {
					if (operation.equals("divide")) {
						oper = 4;
					} else
						oper = 5;
				}

			}
		}

		switch (oper) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a * b;
			break;
		case 4:
			if(b!=0){
			result = a / b;}
			else System.out.println("Error....divide by zero!!!");
			break;
		case 5:
			System.out.println("You've entered incorrect operation");
			break;
		}
		System.out.println("Result is: " + result);
	}
}
