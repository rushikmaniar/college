
//Fibonacci Series
import java.util.*;

class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int prev = 0, current = 1, new_current;
		int i, a;
		System.out.print("enter the number :");
		a = sc.nextInt();

		i = 0;
		System.out.println("Printing Fibonnaci Series");
		while (i < a) {
			new_current = prev + current;
			System.out.print(" " + current);
			prev = current;
			current = new_current;

			i++;

		}
	}
}