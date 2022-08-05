import java.util.Scanner;

public class SwapNum {
	public static void main(String[] args) {
		int i,j,k;
		System.out.println("Enter Two Number For Swappping");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First No: ");
		i=s.nextInt();
		System.out.print("Enter Second No: ");
		j=s.nextInt();
		System.out.println("Before Swapping");
		System.out.println("I is: "+i);
		System.out.println("J is: "+j);
		k=i;
		i=j;
		j=k;
		System.out.println("After Swapping");
		System.out.println("I is: "+i);
		System.out.println("J is: "+j);
	}
}
