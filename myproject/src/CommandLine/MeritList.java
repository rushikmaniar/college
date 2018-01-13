package CommandLine;

import java.util.*;

class MeritList {
	public static void main(String args[]) {
		// Scanner sc = new Scanner(System.in);

		LinkedList<String> names = new LinkedList<String>();
		// LinkedList<String> marks = new LinkedList<String>();
		LinkedList<Float> marks = new LinkedList<Float>();
		// names to linked list
		for (int i = 0; i < args.length; i += 2) {
			names.add(args[i]);
		}

		// marks to linked list
		for (int i = 1; i < args.length; i += 2) {
			marks.add(Float.parseFloat(args[i]));
		}

		System.out.println("Names");
		System.out.print(names);

		System.out.println("marks");
		System.out.print(marks);
		System.out.print("\n\n\n");

		System.out.print("After sorting Marks");
		for (int i = 0; i < marks.size(); i++) {
			for (int j = i; j < marks.size(); j++) {
				if (marks.get(i) > marks.get(j)) {
					// marks swap
					float temp = marks.get(i);
					marks.set(i, marks.get(j));
					marks.set(j, temp);

					// name swap
					String strtemp = names.get(i);
					names.set(i, names.get(j));
					names.set(j, strtemp);
				}

			}
		}

		System.out.println(names);
		System.out.println(marks);
	}
}