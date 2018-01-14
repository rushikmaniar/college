class StringDemo2 {
	public static void main(String args[]) {
		String s1 = "Java is Internet programming language";
		int i = 0;
		int len = s1.length();
		while (i < len) {
			System.out.print(s1.charAt(i));
			if (s1.charAt(i) == 32) {
				System.out.print("\n");
			}
			i++;
		}
	}
}