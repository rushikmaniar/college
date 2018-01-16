package CommandLine;

import java.util.Scanner;

class CLDemo4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String arr[] = args;
		String find;
		int flag = 0;
		System.out.print("Enter City name to find :");
		find = sc.next();
		int i = 0;
		while (i != arr.length) {
			if (arr[i].compareTo(find) == 0) {
				System.out.println("found " + arr[i] + " at array index " + i);
				flag = 1;
			}
			i++;
		}
		if (flag == 0) {
			System.out.print("City not found in Array");
		}

	}
}