//Fibonacci Series
import java.util.*;

class Fibo1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int prev = 0, current = 1, new_current = 0;
		int i, a;
		System.out.print("enter the number :");
		a = sc.nextInt();

		i = 0;
		System.out.println("Printing Fibonnaci Series");
		/*
		 * while(i < a){ new_current = prev + current; System.out.print(" " +
		 * current); prev = current; current = new_current;
		 * 
		 * i++;
		 * 
		 * }
		 */
		i = fibo(i, a, prev, current, new_current);
	}

	public static int fibo(int i, int a, int prev, int current, int new_current) {
		if (i >= a) {
			return 0;
		} else {
			new_current = prev + current;
			System.out.print(" " + current);
			prev = current;
			current = new_current;
			// System.out.print(i);
			return fibo(++i, a, prev, current, new_current);

		}
	}
}