package CommandLine;

import java.util.*;

class CricketDemo_15 {
	public static void main(String args[]) {

		String[] names = new String[5];
		double count = 0;
		int[][] run = new int[4][4];
		int[] total = { 0, 0, 0, 0 };
		String[] heading = { "Name", "Match1", "Match2", "Match3", "Total" };
		
		
		// scan names
		for (int i = 0; i < args.length - 1; i += 4) {
			names[(int) count++] = args[i];
		}
		names[4] = args[args.length - 1];
		// scan runs
		count = 0;
		for (int i = 0; i < 4; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				if (count % 4.0 == 0.00) {
					count++;
					j--;
				} else {
					if (j == 3) {
						run[i][j] = sum;
						total[j] = total[j] + run[i][j];
					} else {
						run[i][j] = Integer.parseInt(args[(int) count++]);
						// row total
						sum = sum + run[i][j];
						// for the final total
						total[j] = total[j] + run[i][j];
					}
				}
			}
		}

		/*
		 * for (String name : names) { System.out.print(" " + name); }
		 * 
		 * for (int i = 0; i < 4; i++) { for (int j = 0; j < 4; j++) {
		 * System.out.println(run[i][j]); } System.out.println("\n"); }
		 * 
		 * System.out.println("\n\n\n\n"); for (int i = 0; i < 4; i++) {
		 * System.out.println(total[i]); }
		 */

		/*
		 * count = 0 ; for(int i=0;i<heading.length;i++) { final1[i] =
		 * heading[(int)count++]; }
		 */
		for (int i = 0; i < heading.length; i++) {
			System.out.print(heading[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0) {
					System.out.print(names[i] +" ");
					System.out.print(run[i][j] + " ");
				} else {
					System.out.print(run[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.print(names[names.length - 1]);

		for (int i = 0; i < total.length; i++) {
			System.out.print(" " + total[i]);
		}
	}
}