
//reverse number 123 to 321
import java.util.*;

class Reverse_number {
	public static void main(String args[]) {
		int i, a, r;
		double sum = 0;
		int digit = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		i = a;
		while (i != 0) {
			r = i % 10;
			digit++;
			i = i / 10;

		}
		// System.out.println(digit);
		i = a;
		int j = digit;
		while (j != 0) {

			r = i % 10;
			double temp = r * Math.pow(10, j - 1);
			sum = sum + temp;
			i = i / 10;
			j--;
		}
		System.out.println(sum);
		sc.close();

	}
}