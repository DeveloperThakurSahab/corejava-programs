import java.util.Scanner;

public class PatternDemo {
	public static void main(String[] args) {
		int i,j,n;
		System.out.print("Enter a No: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("=====================================");
		for(i=1;i<=n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("=====================================");
	}
}
