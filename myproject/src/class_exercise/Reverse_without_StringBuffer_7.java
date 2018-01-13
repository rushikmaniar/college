package class_exercise;
import java.util.*;
class Reverse_without_StringBuffer_7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1;
		int j=0;
		System.out.print("Enter String :");
		s1 = sc.nextLine();
		int i=s1.length()-1;
		int len = s1.length();
		char arr[] = new char[len];
		//String rev ="";
		while(i != -1){
			char c = s1.charAt(i);
			
			arr[j] = c;
			//rev = rev + c;
			//System.out.print(" " + arr[j]);
			i--;
			j++;
		}

		String s2 = new String(arr);
		System.out.print("\n"+s2);
	}
}