
//8. Write a C Program to find area of a rectangle (Hint: A = l*b)
import java.util.*;

class Check_Day {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("\n\n");
		System.out.print("Enter 0 to 6 number and see the day : ");
		a = sc.nextInt();
		switch (a) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		default:
			System.out.print("Wrong input");
		}
		System.out.print("\n\n");
		sc.close();
	}

}
