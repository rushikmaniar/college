package Simple10;
//8. Write a C Program to find area of a rectangle (Hint: A = l*b)
//import java.util.*;
class Rect_Area {
	public static void main(String args[]) {

		System.out.print("\n\n");

		Cal_Rect_Area obj1 = new Cal_Rect_Area();
		obj1.getarea();

		Cal_Rect_Area obj = new Cal_Rect_Area(5, 5);
		obj.getarea();

		System.out.print("\n\n");
	}

}

class Cal_Rect_Area {
	int l, b, area;

	Cal_Rect_Area() {
		// System.out.print("Hello");
		this.l = 10;
		this.b = 20;
		area = l * b;
	}

	Cal_Rect_Area(int l, int b) {
		this.l = l;
		this.b = b;
		area = l * b;

	}

	public void getarea() {

		System.out.println(area);

	}
}
