package Simple10;
//W.A.P. to calculate simple interest and compound interest. 
//(Formula for compound interest A=P(1+R/100)^N )
import java.util.*;

class Simple_Compund {
	public static void main(String args[]) {

		System.out.print("\n\n");

		// simple Intrest
		double principal, rat, time1, simple;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Principal Amount : ");
		principal = sc.nextDouble();

		System.out.print("Enter Rate Of Interest : ");
		rat = sc.nextDouble();

		System.out.print("Enter Time period : ");
		time1 = sc.nextDouble();

		simple = (principal * rat * time1) / 100;
		System.out.println("Simple Interest: " + simple);

		// Compound Interet
		double compound = principal * Math.pow((1 + rat / 100), time1);
		System.out.println("Compound Interest: " + compound);
		sc.close();
		System.out.print("\n\n");
	}
}