package CommandLine;

import java.util.*;

class CLDemo4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String arr[] = args;
		String find;

		System.out.print("Enter City name to find :");
		find = sc.next();
		int i = 0;
		while (i != arr.length) {
			if (arr[i].compareTo(find) == 0) {
				System.out.println("found " + arr[i] + " at array index " + i);
				break;
			}
			i++;
		}
		if (i == arr.length) {
			System.out.print("City not found in Array");
		}

	}
}