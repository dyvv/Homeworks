package ua.pp.dyyv;

import java.util.*;

public class Loto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choise = 0;
		Boolean correct = false;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Please enter your choise: 1- if you choose \"6 from 36\"; " + "2- if you choose \" 7 from 42 \"");
		while (!correct) {
			if (scan.hasNextInt()) {
				choise = scan.nextInt();
			}

			if (choise == 1) {
				System.out.println("You've choosen option 1");
				correct = true;
				int[] array01 = new int[6];
				System.out.println("Here is your numbers:");
				for (int i = 0; i < array01.length; i++) {
					Boolean uniq;
					int tmp;
					int j = 0;
					do {
						uniq = true;
						tmp = rand.nextInt(36) + 1;

						while (j < i) {

							if (array01[j] == tmp) {
								uniq = false;

							}

							j++;
						}

					} while (!uniq);

					array01[i] = tmp;

					System.out.print(array01[i] + " ");

				}

			} else if (choise == 2) {
				System.out.println("You've choosen option 2");
				correct = true;
				int[] array02 = new int[7];
				System.out.println("Here is your numbers:");
				for (int i = 0; i < array02.length; i++) {
					Boolean uniq;
					int tmp;
					int j = 0;
					do {
						uniq = true;
						tmp = rand.nextInt(36) + 1;

						while (j < i) {

							if (array02[j] == tmp) {
								uniq = false;

							}

							j++;
						}

					} while (!uniq);

					array02[i] = tmp;

					System.out.print(array02[i] + " ");

				}
			} else {
				System.out.println("You've entered incorrect choise!!");
			}
		}
	}
}
