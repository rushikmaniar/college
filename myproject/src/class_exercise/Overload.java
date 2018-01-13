package class_exercise;
import java.util.*;

class Overload {
	public static void main(String args[]) {

		System.out.println("Default Constructor");
		Cube c1 = new Cube();
		System.out.println("\n---------------------------------\n");
		System.out.println("One Argumant Constructor");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Integer : ");
		int a = sc.nextInt();
		Cube c2 = new Cube(a);

	}
}

class Cube {
	public double l = 10, volume = 0;

	public Cube() {
		volume = Math.pow(l, 3);
		System.out.println("Default length : " + l);
		System.out.println("Cube Volume : " + volume);
	}

	public Cube(int l) {
		this.l = l;
		volume = Math.pow(this.l, 3);

		System.out.println("Cube Volume " + volume);
	}
}