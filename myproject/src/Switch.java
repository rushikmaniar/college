import java.util.*;

class Switch {
	static String[] units = new String[] { "Zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine" };
	static String[] tens = new String[] { "", "eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen" };
	static String[] tens1 = new String[] { "", "Ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
			"eighty", "ninety" };
	static String[] large = new String[] { "Hundred", "Thousand", "Lakh", "Crore" };
	static int input;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String twodigit, threedigit, fourdigit, sixdigit, eightdigit, words = "";
		int a;
		System.out.print("Enter number:");
		a = sc.nextInt();
		// System.out.println(Integer.MAX_VALUE);
		System.out.println(a);
		input = a;
		int i = a;
		if (i == 0) {
			System.out.println(units[0]);
		} else if (i < 0) {
			i = i * (-1);

			words = "negative-";
		} else {
			words = "positive-";
		}
		if (i > 0 && i < 100) {
			twodigit = gettwo(i);
			words = words + twodigit;
		} else if (i >= 100 && i < 1000) {
			threedigit = getthree(i);
			words = words + threedigit;
		} else if (i >= 1000 && i < 100000) {
			fourdigit = getfour(i);
			words = words + fourdigit;
		} else if (i >= 100000 && i < 10000000) {
			sixdigit = getsix(i);
			words = words + sixdigit;
		} else if (i >= 10000000 && i < 1000000000) {
			eightdigit = geteight(i);
			words = words + eightdigit;
		}

		System.out.println(words);
		sc.close();

	}

	public static String gettwo(int a) {
		String twodigit = "";
		if (a > 0 && a < 10) {
			twodigit = units[a];
		} else if (a >= 11 && a <= 19) {
			twodigit = tens[a - 10];
		} else if (a > 20 && a < 100 && a % 10 != 0) {
			int q = a / 10;
			int r = a % 10;
			twodigit = tens1[q] + "-" + units[r];
		} else {
			int q = a / 10;
			twodigit = tens1[q];
		}
		return (twodigit);

	}

	public static String getthree(int a) {
		String threedigit = "";
		if (a % 100 == 0) {
			int q = a / 100;
			if (q != 0)
				threedigit = units[q] + "-" + large[0];
		} else {
			int q = a / 100;
			int r = a % 100;
			if (q != 0)
				threedigit = units[q] + "-" + large[0] + "-" + gettwo(r);
			else
				threedigit = gettwo(r);
		}
		return (threedigit);

	}

	public static String getfour(int a) {
		String fourdigit = "";
		if (a % 1000 == 0) {
			int q = a / 1000;
			if (q != 0)
				fourdigit = gettwo(q) + "-" + large[1];
		} else {
			int q = a / 1000;
			int r = a % 1000;
			if (q != 0)
				fourdigit = gettwo(q) + "-" + large[1] + "-" + getthree(r);
			else
				fourdigit = gettwo(q) + "-" + getthree(r);
		}
		return (fourdigit);

	}

	public static String getsix(int a) {
		String sixdigit = "";
		if (a % 100000 == 0) {
			int q = a / 100000;
			if (q != 0)
				sixdigit = gettwo(q) + "-" + large[2];
		} else {
			int q = a / 100000;
			int r = a % 100000;
			if (q != 0)
				sixdigit = gettwo(q) + "-" + large[2] + "-" + getfour(r);
			else
				sixdigit = gettwo(q) + "-" + getfour(r);
		}
		return (sixdigit);

	}

	public static String geteight(int a) {
		String eightdigit = "";
		if (a % 10000000 == 0) {
			int q = a / 10000000;
			if (q != 0)
				eightdigit = gettwo(q) + "-" + large[3];
		} else {
			int q = a / 10000000;
			int r = a % 10000000;
			if (q != 0)
				eightdigit = gettwo(q) + "-" + large[3] + "-" + getsix(r);
			else
				eightdigit = gettwo(q) + "-" + getsix(r);
		}
		return (eightdigit);

	}

}