/*10. Write a C Program to find the 
volume of a cube (V=l3), 
volume of a cuboid (Hint: V = l*b*h), 
volume of a cylinder (V=Πr2h), 
volume of a sphere (V=4/3Πr3), 
volume of a cone (V=1/3Πr2h)*/
import java.util.*;

class Volume {

	public static cal_vol obj = new cal_vol();

	public static void main(String args[]) {

		System.out.print("\n\n");
		System.out.println("\t\tVolume");
		// obj.cube();
		// obj.cuboid();
		// obj.Cylinder();
		obj.Cone();
		// obj.Sphere();

	}
}

class cal_vol {
	public Scanner sc = new Scanner(System.in);

	public void cube() {
		// Volume of cube
		System.out.println("volume of cube");
		double l, volume;
		System.out.print("Enter the Length of cube : ");
		l = sc.nextDouble();
		volume = l * l * l;
		System.out.println("Volume of cube : " + volume + "\n");
	}

	public void cuboid() {
		// Volume of cuboid
		System.out.println("volume of cuboid");

		double b, h, l, volume;
		System.out.print("Enter the Length,Breath,Height of cuboid : ");
		l = sc.nextDouble();
		b = sc.nextDouble();
		h = sc.nextDouble();

		volume = l * b * h;
		System.out.println("Volume of cuboid : " + volume);

	}

	public void Cylinder() {

		// Volume of Cylinder
		System.out.println("volume of Cylinder");

		double r, h, volume;
		System.out.print("Enter the radius,height of Cylinder : ");
		r = sc.nextDouble();
		h = sc.nextDouble();
		volume = Math.PI * r * r * h;

		System.out.println("Volume of Cylinder : " + volume);
	}

	public void Sphere() {

		// Volume of sphere
		System.out.println("volume of Sphere");

		double r, volume;
		System.out.print("Enter the radius of sphere : ");
		r = sc.nextDouble();
		volume = (4 / 3) * Math.PI * r * r * r;

		System.out.println("Volume of Cylinder : " + volume);
	}

	public void Cone() {

		// Volume of sphere
		System.out.println("volume of Cone");

		double r, h, volume;
		System.out.print("Enter the radius,height of Cone : ");
		r = sc.nextDouble();
		h = sc.nextDouble();
		volume = (0.33) * (Math.PI * (r * r) * h);

		System.out.println("Volume of Cone : " + volume);
	}

}
