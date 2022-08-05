import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		String sname;
		int rno,s1,s2,s3,total;
		double percent;
		
		System.out.print("Enter the name: ");
		Scanner s = new Scanner(System.in);
		sname = s.next();
		System.out.print("Enter the rno: ");
		rno = s.nextInt();
		System.out.print("Enter the s1: ");
		s1 = s.nextInt();
		System.out.print("Enter the s2: ");
		s2 = s.nextInt();
		System.out.print("Enter the s3: ");
		s3 = s.nextInt();
		
		total = s1+s2+s3;
		percent = total/3;
		
		System.out.println("Name is: "+ sname);
		System.out.println("Rollno is: "+ rno);
		System.out.println("Total marks obtained is : "+ total);
		System.out.println("Percentage is: "+ percent);
}
}
