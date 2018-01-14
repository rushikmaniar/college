
//Create class named MathDemo. 
//Calculate & print area of circle. Use Math class to get value of PI
import java.util.*;

class MathDemo {
	public static void main(String args[]) {
		double r = 0, area, pi = Math.PI;
		System.out.print("Enter radius of Circle :");
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		area = pi * r * r;
		System.out.println("Area of Circle for above radius : " + area);
		sc.close();
	}

}