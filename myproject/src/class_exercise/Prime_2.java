package class_exercise;

//Write a program in Java to find out if a number is prime in Java
import java.util.*;

class Prime_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n");

		int a;
		System.out.print("Enter Integer : ");
		a = sc.nextInt();
		Prime1 p1 = new Prime1();
		p1.checkPrime(a);

		System.out.print("\n\n");
		sc.close();
	}
}

class Prime1 {
	public void checkPrime(int a) {

		int x = 0;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				x = 1;
				System.out.print("Not Prime");
				break;
			}
		}
		if (x == 0) {
			System.out.print("It is Prime");
		}

	}

}
