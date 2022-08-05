import java.util.Scanner;

public class PalindromeDemo {
	public static void main(String[] args) {
		int r,sum=0,temp,n;
		System.out.print("Enter Number: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		temp=n;
		while(n>0) 
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
	}
}
