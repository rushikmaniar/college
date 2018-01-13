package class_exercise;

//Fibonacci Series
import java.util.*;

class Fibonacci_11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int prev = 0, current = 1, new_current;
		int i, a;
		System.out.print("enter the number :");
		a = sc.nextInt();

		i = 0;
		System.out.println("\n\n Printing Fibonnaci Series using Iterative ");
		while (i < a) {
			new_current = prev + current;
			System.out.print(" " + current);
			prev = current;
			current = new_current;
			i++;
		}

		System.out.println("\n\n Printing Fibonnaci Series using Recursion ");

		prev = 0;
		current = 1;
		new_current = 0;
		i = 0;
		Fibo(prev, current, new_current, i, a);

	}

	public static void Fibo(int prev, int current, int new_current, int i, int a) {
		if (i == a) {
			return;
		} else {
			new_current = prev + current;
			System.out.print(" " + current);
			prev = current;
			current = new_current;
			i++;
			Fibo(prev, current, new_current, i, a);
			return;
		}
	}
}