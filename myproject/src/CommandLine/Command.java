package CommandLine;

public class Command {
	public static void main(String args[]) {
		int from = Integer.parseInt(args[0]);
		int to = Integer.parseInt(args[1]);
		for (int i = from; i < to; i++) {
			int x = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					x = 1;
				}
			}
			if (x == 0) {
				System.out.print(" " + i);
			}
			x = 0;
		}
	}
}