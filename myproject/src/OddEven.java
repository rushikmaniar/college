//Create class named MathDemo. 
//Calculate & print area of circle. Use Math class to get value of PI
import java.util.*;

class OddEven {
	public static void main(String args[]) {
		int a;
		CheckOddEven c = new CheckOddEven();
		a = c.getdata();
		c.CheckOddeven(a);
		
	}
	
}
class  CheckOddEven {
	public  int getdata(){
		System.out.print("Enter Integer :");
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		
		sc.close();
		return a;
	}
	public  void CheckOddeven(int a){
		if(a==0){
			System.out.print("Zero");
		}
		else if(a%2 == 0){
			System.out.print("Even");
		}
		else{
			System.out.print("Odd");
		}
	}
	
}