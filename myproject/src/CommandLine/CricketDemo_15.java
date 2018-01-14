package CommandLine;

import java.util.*;

class CricketDemo_15 {
	public static void main(String args[]) {

		String[] names = new String[5];
		int count = 0;
		double[][] run = new double[4][4];
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = 0; j < names.length - 1; j++) {

				if (j == 0) {
					names[j] = args[count++];
				} else {
					run[i][j] = Double.parseDouble(args[count++]);
				}

			}
		}
		for (String name : names) {
			System.out.print(" " + name);
		}
	}
}