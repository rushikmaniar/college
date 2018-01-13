class Demo1 {
	public static void main(String args[]) {
		// B b1 = new B();
		A a1 = new A();

	}
}

class A {

	public A() {
		System.out.println("Default A");
	}

	public A(int i) {
		System.out.println("From class A");
	}

}

class B extends A {
	public B() {
		System.out.println("Default B");
	}

	public B(int i) {
		System.out.println("From class B" + i);
	}

}

class C extends B {
	public C() {
		System.out.println("Default C");
	}

	public C(int i) {
		System.out.println("From class C");
	}

}