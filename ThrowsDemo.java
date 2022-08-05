import java.util.Scanner;

public class ThrowsDemo {
	public static void demo() throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter X: ");
			int x = sc.nextInt();
			if(x>0) {
				System.out.println("Square of "+x+" + is: " +(x*x));
			}
			else {
				throw new ArithmeticException("Please Enter Positive Number");
			}
	}
	public static void main(String[] args) {
		try {
			demo();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}