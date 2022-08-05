import java.util.Scanner;

public class nestedif_demo {
	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter the value for a: ");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		System.out.print("Enter the value for b: ");
		b=s.nextInt();
		System.out.print("Enter the value for c: ");
		c=s.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("A is greater.");
			}
			else {
				System.out.println("C is greater.");
			}
		}
		else {
			if(b>c) {
				System.out.println("B is greater.");
			}
			else {
				System.out.println("C is greater.");
			}
		}
}
}