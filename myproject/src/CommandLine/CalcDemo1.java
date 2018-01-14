package CommandLine;

class CalcDemo1 {
	public static void main(String args[]) {
		// CalcDemo1 c1 = new CalcDemo1();
		double ans = 0;

		double a = Double.parseDouble(args[0]);
		char[] c = args[1].toCharArray();
		double b = Double.parseDouble(args[2]);

		switch (c[0]) {
		case '+':
			System.out.print("Addition :");
			ans = add(a, b);
			System.out.print(ans);
			break;
		case '-':
			System.out.print("Subtraction :");
			ans = sub(a, b);
			System.out.print(ans);
			break;
		case 'x':
			System.out.print("Multiplication :");
			ans = mul(a, b);
			System.out.print(ans);
			break;
		case '/':

			System.out.print("Division :");
			if (b == 0)
				System.out.print("Division not possible");
			else
				ans = div(a, b);
			System.out.print(ans);
			break;
		case '%':
			System.out.print("Modules :");
			if (b == 0)
				System.out.print("Division not possible");
			else
				ans = mod(a, b);
			System.out.print(ans);

			break;
		}

	}

	public static double add(double a, double b) {
		double c = a + b;
		return c;
	}

	public static double sub(double a, double b) {
		double c = a - b;
		return c;
	}

	public static double mul(double a, double b) {
		double c = a * b;
		return c;
	}

	public static double div(double a, double b) {
		double c = a / b;
		return c;
	}

	public static double mod(double a, double b) {
		double c = a % b;
		return c;
	}
}