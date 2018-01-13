class StringDemo5_1 {
	public static void main(String args[]) {
		String1 s1 = new String1();
		int len = s1.str1.length();

		for (int i = 0; i <= len; i++) {
			for (int j = len; j >= i; j--) {
				System.out.print(" ");
			}
			String1 str = new String1(0, i);
			System.out.println(str.str2);
		}

	}
}

class String1 {
	public String str1 = "CHRIST", str2;

	public String1() {

	}

	public String1(int start, int noofchar) {
		str2 = str1.substring(start, noofchar);

	}
}