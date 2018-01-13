//9. Write a C Program to find area of a triangle (Hint: A = ½ *h*b)
import java.util.*;
class Tri_Area {
	public static void main(String args[]){

		System.out.print("\n\n");
		Scanner sc = new Scanner(System.in); 
		double b,h,area;
		System.out.print("Enter Base and Hypo of traingle : ");
		b=sc.nextDouble();
		h=sc.nextDouble();
		area = 0.5*h*b;
		System.out.println("Area Of traingle : "+area);
		System.out.print("\n\n");
		sc.close();
	}
}

