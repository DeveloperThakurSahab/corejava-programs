import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start Code");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter A: ");
		a = sc.nextInt();
		System.out.print("Enter B: ");
		b = sc.nextInt();
		c = a/b;
		System.out.println("Division is: "+c);
		int arr[] = {1,2,3,4,5};
		System.out.println("Enter Index Number To Print Value: ");
		int index = sc.nextInt();
		System.out.println(arr[index]);
		String st = "AnkushRajput";
		System.out.println(st.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: "+e);
		}
		catch(NullPointerException e) {
			System.out.println("Exception caught: "+e);
		}
		System.out.println("End Code");
	}
}