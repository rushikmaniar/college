package stringdemo;

import java.util.*;

class StringDemo3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String :");
		String s1 = sc.next(), temp = s1;
		// String s1 = "MALAYALAM",temp=s1;
		StringBuffer str = new StringBuffer(temp);
		str.reverse();
		if (s1 == temp) {
			System.out.println(s1 + " = " + temp);
			System.out.print("string is Palindrome");
		} else {
			System.out.println(s1 + " != " + temp);
			System.out.print("string is Not Palindrome");
		}

	}
}
/*
 * int i = 0; int len = s1.length(); while(i<len){
 * System.out.print(s1.charAt(i)); if(s1.charAt(i) == 32){
 * System.out.print("\n"); } i++; }
 */