import java.util.Scanner;

public class elseif_demo {
	public static void main(String[] args) {
		int time = 22;
		if(time<10) {
			System.out.println("Good Morning.");
		}
		else if(time<19) {
			System.out.println("Good Day.");
		}
		else {
			System.out.println("Good Evening.");
		}
		
		
		
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
		
		if(percent>70) {
			System.out.println("Distinction");
		}
		else if(percent>60) {
			System.out.println("First Division");
		}
		else if(percent>50) {
			System.out.println("Second Division");
		}
		else if(percent>40) {
			System.out.println("Third Division");
		}
		else {
			System.out.println("Fail");
		}
	}
}
