package class_exercise;

class Override_15 {
	public static void main(String args[]) {
		Circle c1 = new Circle();
		// circle area
		int r = 5;
		c1.area(r);

		// rectangle area
		double l = 5, b = 10;
		c1.area(l, b);

		// rectangle area
		double s = 10;
		c1.area(s);
	}
}

class Shape {
	// Circle Area
	public void area(int r) {
		// circle area
		System.out.println("Area of circle : " + (r * r * Math.PI));
	}

	// rectangle area
	public void area(double l, double b) {
		// circle rectangle
		System.out.println("Area of Rectangle : " + (l * b));
	}

	// Square area
	public void area(double l) {
		// Square Area
		System.out.println("Area of Square : " + (l * l));
	}

}

class Circle extends Shape {
	// Circle Area
	public void area(int r) {
		// circle area
		System.out.println("Methid Overrided");
		System.out.println("Area of circle : " + (r * r * Math.PI));
	}

	// rectangle area
	public void area(double l, double b) {
		// circle rectangle
		System.out.println("Methid Overrided");
		System.out.println("Area of Rectangle : " + (l * b));
	}

	// Square area
	public void area(double l) {
		// Square Area
		System.out.println("Methid Overrided");
		System.out.println("Area of Square : " + (l * l));
	}
}