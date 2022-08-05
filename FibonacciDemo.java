import java.util.Scanner;

public class FibonacciDemo {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,n;
		System.out.print("Enter the Number from which you want to print Fibonacci series: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		System.out.print(n1 + " "+ n2);
		for(i=2;i<n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
}
