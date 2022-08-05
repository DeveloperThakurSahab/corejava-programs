import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j;
		System.out.println("Enter the Elements fo Array a: ");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("Enter "+i+"Row and "+j+"Column for Array A: ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the Elements fo Array b: ");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("Enter "+i+"Row and "+j+"Column for Array b: ");
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Addition of Array Elements Are in C: ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	}
}
