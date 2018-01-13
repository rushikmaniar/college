package class_exercise;

import java.util.*;

class Factorial_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, a, sum = 1;
		System.out.print("Enter integer :");
		a = sc.nextInt();

		while (i <= a) {
			sum = sum * i;
			i++;
		}
		System.out.println("Factorial with Iterative : " + sum);

		i = 1;
		sum = 1;
		sum = Fact(i, a, sum);
		System.out.println("Factorial With Recursive : " + sum);

	}

	public static int Fact(int i, int a, int sum) {
		if (i > a) {
			return sum;
		} else {
			sum = sum * i;
			sum = Fact(++i, a, sum);
			return sum;
		}
	}
}