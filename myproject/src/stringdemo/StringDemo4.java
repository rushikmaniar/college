package stringdemo;

class StringDemo4 {
	public static void main(String args[]) {
		String s1 = "CHRIST";

		int len = s1.length();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s1.charAt(j));
			}
			System.out.print("\n");
		}
	}
}