package CommandLine;

import java.util.*;

class CricketDemo_15 {
	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> marks = new ArrayList<Double>();
		ArrayList<Double> ind_Total = new ArrayList<Double>();
		for (int i = 0; i < 4; i++) {
			double local_total = 0 ;
			if (i == 1) {
				names.add(args[i]);
			} else {
				double mark = Double.parseDouble(args[i]);
				local_total = local_total + marks;
				marks.add(mark);
			}
		}

	}
}