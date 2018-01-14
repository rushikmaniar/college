package stringdemo;

class StringDemo5 {
	public static void main(String args[]) {
		String s1 = "CHRIST";
		int len = s1.length();

		for (int i = 1; i <= len; i++) {
			for (int j = len; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println(s1.substring(0, i));
		}

		/*
		 * for (int i = 1; i <= len; i++) { System.out.println(s1.substring(0, i)); }
		 */

	}
}