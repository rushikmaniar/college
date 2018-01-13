//Write a program that can convert degrees Fahrenheit to degrees Celsius.
//C= (F-32) * 5 / 9
import java.util.*;
class F_TO_C {
	public static void main(String args[]){

		System.out.print("\n\n");
		
		//simple Intrest
		double F,C;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Fahrenheit  : ");
		F = sc.nextDouble();
		C= (F-32) * 5 / 9;
		System.out.print("Celsius is : " + C + " degrees");
		
		System.out.print("\n\n");
		sc.close();
	}
	
}