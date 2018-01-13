//How to find if a number is power of 2 in Java?
import java.util.*;
class Sort {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
            System.out.print(" \n\n");

            int[] arr = new int[10];
            System.out.print("Enter 10 numbers ");
            for (int i = 0; i < 10; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Sort1 s1 = new Sort1();
            
            arr = s1.GetSort(arr);
            System.out.print(" Printing 10 numbers ");
            
            for (int i = 0; i < 10; i++)
            {
                System.out.print(" " + arr[i]);
            }
            System.out.print(" \n\n");
        }

	
}
class Sort1 {
	
	public int[] GetSort(int arr[]){
	
		for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
		return arr;
	}
}
