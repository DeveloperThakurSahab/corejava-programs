import java.util.Scanner;

public class switchcasedemo {
	public static void main(String[] args) {
		int a,b,c,d;
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number: ");
		a=s.nextInt();
		System.out.print("Enter second number: ");
		b=s.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter your choice: ");
		c=s.nextInt();
		switch(c) 
		{
		case 1:{
			c=a+b;
			System.out.println("Addition is: "+c);
			break;
		}
		case 2:{
			c=a-b;
			System.out.println("Subtraction is: "+c);
			break;
		}
		case 3:{
			c=a*b;
			System.out.println("Multiplication is: "+c);
			break;
		}
		case 4:{
			c=a/b;
			System.out.println("Division is: "+c);
			break;
		}
		default:{
			System.out.println("Invalid choice");
			break;
		}
		}
	}
}
