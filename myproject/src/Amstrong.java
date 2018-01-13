//reverse number 123 to 321
import java.util.*;

class Amstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter Number :");
		a = sc.nextInt();
		Amstrong1 a1 = new Amstrong1();
		a1.CheckAmstrong(a);

		sc.close();

	}
}

class Amstrong1 {

	public void CheckAmstrong(int a) {
		int digit = getdigit(a);

		double sum = 0;
		int i, r;

		i = a;
		while (i != 0) {
			r = i % 10;
			double temp = Math.pow(r, digit);
			sum = sum + temp;
			i = i / 10;

		}
		if (sum == a)
			System.out.println("It is Amstrong");
		else
			System.out.println("Not Amstrong");

	}

	public int getdigit(int a) {
		int i, digit = 0;

		i = a;
		while (i != 0) {
			// r = i % 10;
			digit++;
			i = i / 10;

		}
		return (digit);
	}
}