package class_exercise;

//import java.util.*;

class Prime_range_13 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		int from, to, x = 0;
		// System.out.print("Enter Range for getting prime numbers : ");
		// from = sc.nextInt();
		// to = sc.nextInt();

		from = Integer.parseInt(args[0]);
		to = Integer.parseInt(args[1]);
		System.out.print("prime numbers in given range: ");
		if (to <= from) {
			System.out.print("To Should be greater than from");
		} else {
			for (int i = from; i <= to; i++) {

				int t = Math.abs(i);

				for (int j = 2; j < (t / 2) + 1; j++) {
					if (i % j == 0) {
						x = 1;
					}
				}
				if (x == 0) {
					System.out.print(" " + i);
				}
				x = 0;

			}

			System.out.print(" \n\n");
		}

	}
}