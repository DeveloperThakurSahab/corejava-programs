import java.util.Scanner;

public class GCDDemo {
	public static void main(String[] args) {
		int x,y,gcd=1;
		System.out.print("Enter the first no: ");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		System.out.print("Enter the second no: ");
		y=s.nextInt();
		
		for(int i=1;i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0)
				gcd = i;
		}
		System.out.println("GCD of "+x+" and "+y+" is: "+gcd);
	}
}
