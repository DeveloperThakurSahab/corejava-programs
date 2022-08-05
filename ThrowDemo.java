import java.util.Scanner;

public class ThrowDemo {
	public static void demo(){
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter X: ");
			int x = sc.nextInt();
			if(x>0) {
				System.out.println("Square of "+x+" + is: " +(x*x));
			}
			else {
				throw new Exception("Please Enter Positive Number");
			}
			}
		catch(Exception e){
			System.out.println("Exception caught: "+e);
			demo();
		}
	}
	public static void main(String[] args) {
		demo();
	}
}
