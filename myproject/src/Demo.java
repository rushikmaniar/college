//import java.util.*;

class Demo {
	public static void main(String args[]) {
		Rect r1 = new Rect(5, 10);
		r1.getArea();
		Circle c1 = new Circle(5);
		c1.getArea();
	}

}

class Rect {
	double l, b, r, pi = Math.PI, area;

	Rect() {

	}

	Rect(double l, double b) {
		this.l = l;
		this.b = b;
	}

	void getArea() {
		area = l * b;
		System.out.println("Area of Rectangle : " + area);
	}

}

class Circle extends Rect {
	double pi = 3.14;

	Circle(double r1) {
		super.r = r1;
	}

	void getArea() {
		super.area = super.pi * r * r;
		System.out.println("Area of Circle : " + area);
	}

}