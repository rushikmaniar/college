//Write Java program to check if a number is palindrome in Java
import java.util.*;
class Palindrome {
	public static void main(String args[]) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		a = sc.nextInt();
		Palindrome1 p1 = new Palindrome1();
		p1.CheckPalindrome(a);
		sc.close();
		
	}
}
class Palindrome1{
	
	public void CheckPalindrome(int a){
		int i,r;
		double sum = 0;
		int digit = 0;
		
		i = a;
		while (i != 0) {
			r = i % 10;
			digit++;
			i = i / 10;

		}
		// System.out.println(digit);
		i = a;
		int j = digit;
		while (j != 0) {

			r = i % 10;
			double temp = r * Math.pow(10, j - 1);
			sum = sum + temp;
			i = i / 10;
			j--;
		}
		//System.out.println(sum);
		if(a == sum){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is Not Palindrome");
		}
		
	}
}