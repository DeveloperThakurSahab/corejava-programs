import java.util.Scanner;

public class FactorialDemo {
	public static void main(String[] args) {
		int i,fact=1,n;
		System.out.print("Enter the No: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+n+" is :"+fact);
	}
}
