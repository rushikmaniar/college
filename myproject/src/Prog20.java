class Prog20 {
	public static void main(String args[]) {

		for (int i = 0; i < 5; i += 2) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i = 3; i > 0; i -= 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}