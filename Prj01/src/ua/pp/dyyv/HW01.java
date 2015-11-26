package ua.pp.dyyv;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		boolean bul=true;
		System.out.println("This is a simple calculator.\n  Please enter the first number:");
		beg: do  {
			//System.out.println("You've entered incorrect number ");
			if(scan.hasNextInt())
			
			{a = scan.nextInt();
			 bul=false;  }
			
			else
			{System.out.println("You've entered incorrect data...Please try again");
			continue beg;}
		} while (bul);
			
		}

	}


