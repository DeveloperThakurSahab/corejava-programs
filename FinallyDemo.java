import java.util.Scanner;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("Start Program");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
		System.out.print("Enter B: ");
		b=sc.nextInt();
		try {
			c=a/b;
			System.out.println("Division is: "+c);
			System.out.println("Program Continue");
		}
		catch(ArithmeticException e) {
			System.out.println("Division By Zero Not Possible");
		}
		finally {
			System.out.println("Finally block called.");
		}
		System.out.println("Program Ends");
	}
}
