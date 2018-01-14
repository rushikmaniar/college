package class_exercise;

//How to find if a number is power of 2 in Java?
import java.util.*;

class Power_of_2_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.print("Enter Integer :");
		a = sc.nextDouble();
		Power1 p1 = new Power1();
		p1.CheckPower(a);
		sc.close();
	}
}

class Power1 {

	public void CheckPower(double a) {

		double i = 0, j = 0, flag = 0;
		while (i <= a) {
			i = Math.pow(2, j);
			if (i == a) {
				flag = 1;
				break;
			}
			j++;
		}
		if (flag == 1) {
			System.out.print("Power Of 2");
		} else {
			System.out.print("Not Power Of 2");
		}

	}

}
