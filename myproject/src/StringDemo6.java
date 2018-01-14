import java.util.*;

class StringDemo6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.print("Enter string1 : ");
		s1 = sc.next();
		System.out.print("Enter string2 : ");
		s2 = sc.next();

		// Equality
		if (s1.length() == s2.length()) {
			System.out.println("Equality");
		} else {
			System.out.println("Not Equality");
		}

		/*
		 * if(s1.compareTo(s2))){ System.out.println("Both Are Equal"); } else {
		 * System.out.println("Not Equal"); }
		 */

	}
}