package ua.pp.dyyv;

import java.util.*;

public class Matches {

	public static void main(String[] args) {
		int QUANTITY = 11;
		int remove = 0;
		int quantity;
		int rem;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("You have " + QUANTITY + " matches, which are shown below:  ");
		for (int i = 0; i < QUANTITY; i++)
			System.out.print("| ");
		System.out.println();
		System.out.println(
				"You can remove one, two or tree matches. The winner is the one who takes the last match.\n"
				+ "Do you want to start first? (input 1 - \"yes\", or 0 -\"no\") ");
		int i = scan.nextInt();
		if (i == 0) {
			quantity = QUANTITY;
			rem = quantity % 4;
			System.out.println("My turn...I will remove " + rem + " matches");
			quantity = quantity - rem;
			System.out.println("Here is a current number of matches (" + quantity + "):");
			for (int j = 0; j < quantity; j++)
				System.out.print("| ");
			System.out.println();

			do {
				System.out.println("Your turn..Please inter number of marches to remove: 1-3");

				remove = scan.nextInt();
				System.out.println("You want to remove " + remove + " number of matches..");
				quantity = quantity - remove;
				System.out.println("Here is a current number of matches (" + quantity + "):");
				for (int j = 0; j < quantity; j++)
					System.out.print("| ");
				System.out.println();
				System.out.println("My turn...");
				if (quantity > 4) {
					rem = quantity % 4;
					quantity = quantity - rem;
					System.out.println("I want to remove " + rem + " matches...");
					System.out.println("Here is a current number of matches (" + quantity + ") :");
					for (int j = 0; j < quantity; j++)
						System.out.print("| ");
					System.out.println();
				} else if (quantity < 4) {
					rem = quantity;
					System.out.println("I want to remove " + rem + " matches...");
					quantity = quantity - rem;

				}
			} while (quantity != 0);

			System.out.println("I've removed last " + rem + " matches. I'am win!!!");

		} else if (i == 1) {
			quantity = QUANTITY;
			rem = 0;
			do {
				System.out.println("Your turn..Please inter number of marches to remove: 1-3");
				remove = scan.nextInt();
				System.out.println("You want to remove " + remove + " matches..");
				quantity = quantity - remove;
				if (quantity == 0) {
					System.out.println("You've removed last " + remove + " matches. You winn!!! Congrat!!!");
					break;
				}
				System.out.println("Here is a current number of matches (" + quantity + "):");
				for (int j = 0; j < quantity; j++)
					System.out.print("| ");
				System.out.println();
				System.out.println("My turn...");

				if ((quantity > 4) && ((quantity % 4) != 0)) {
					rem = quantity % 4;
				} else if ((quantity % 4) == 0) {
					rem = rand.nextInt(3) + 1;
				} else if (quantity < 4) {
					rem = quantity;
					System.out.println("I will remove last " + rem + " matches. I'm win!!!");
					break;
				}

				quantity = quantity - rem;

				System.out.println("I want to remove " + rem + " matches...");
				System.out.println("Here is a current number of matches (" + quantity + ") :");

				for (int j = 0; j < quantity; j++)
					System.out.print("| ");
				System.out.println();

			} while (quantity != 0);

		}

	}

}
