import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num;
		System.out.print("Enter Number: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("Entered no is Even.");
		}
		else
		{
			System.out.println("Entered no is Odd.");
		}
	}
}
