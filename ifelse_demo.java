import java.util.Scanner;

public class ifelse_demo {
	public static void main(String[] args) {
		int i;
		System.out.print("Enter a Number: ");
		Scanner s = new Scanner(System.in);
		i=s.nextInt();
		
		if (i%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		int y;
		System.out.print("Enter a Number: ");
		y=s.nextInt();
		if (y>0) {
			System.out.println("Positive Number");
		}
		else {
			System.out.println("Negative Number");
		}
	}
}
