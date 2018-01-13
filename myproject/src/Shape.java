import java.util.*;

class Shape {
	public static void main(String args[]) {
		double l, b, h, area, r;
		int c = -1;
		Scanner sc = new Scanner(System.in);
		while (c != 5) {
			System.out.println("Area Of Shape");
			System.out.println("Circle:0\nSquare:1\nRectangle:2\nCylinder:3\nTriangle:4\nExit:5\n");
			System.out.print("Enter Your Choice :");
			c = sc.nextInt();
			switch (c) {
			case 0:
				// Circle
				TwoDShape cir = new TwoDShape();
				System.out.print("Enter Raduis of Circle : ");
				r = sc.nextDouble();
				area = cir.Circle(r);
				System.out.println("Area of Circle :" + area);
				break;
			case 1:
				// Square
				TwoDShape sq = new TwoDShape();
				System.out.print("Enter Lenght of Square : ");
				l = sc.nextDouble();
				area = sq.Square(l);
				System.out.println("Area of Square :" + area);
				break;
			case 2:
				// Rectangle
				TwoDShape rect = new TwoDShape();
				System.out.print("Enter Lenght and Breath :");
				l = sc.nextDouble();
				b = sc.nextDouble();
				area = rect.Rectangle(l, b);
				System.out.println("Area of Rectangle :" + area);
				break;
			case 3:
				// Cylinder
				TwoDShape Cyl = new TwoDShape();
				System.out.print("Enter Raduis and Height of cylinder :");
				r = sc.nextDouble();
				h = sc.nextDouble();
				area = Cyl.Cylinder(r, h);
				System.out.println("Area of Cylinder :" + area);
				break;
			case 4:
				// Triangle
				TwoDShape tri = new TwoDShape();
				System.out.print("Enter Hypotenius and Base of Triangle :");
				h = sc.nextDouble();
				b = sc.nextDouble();
				area = tri.Triangle(h, b);
				System.out.println("Area of Cylinder :" + area);
				break;
			case 5:
				System.out.println("Bye");
				System.exit(0);
				break;
			default:
				System.out.print("Invalid Input");
				break;
			}
		}
	}
}

class TwoDShape {
	
	double l, b, h, area, pi = Math.PI, r;

	public double Square(double l) {
		area = l * l;
		return area;
	}
	
	public double Rectangle(double l, double b) {
		area = l * b;
		return area;
	}

	public double Circle(double r) {
		area = pi * r * r;
		return area;
	}

	public double Cylinder(double r, double h) {
		area = pi * r * r * h;
		return area;
	}

	public double Triangle(double h, double b) {
		area = 0.5 * h * b;
		return area;
	}

}