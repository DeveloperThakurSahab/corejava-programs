import java.util.Scanner;

/*
 * Static: static keyword is used to declare variable, method & block.
 * By default static variable is initialized  to zero or null when object is created.
 * static variable is created for common memory allocation amongst the object.
 * No need to create an object to call static method. It is directly call using the object of class.
 * static method only allows another static members.
 * static block is called before main method.
 * */
public class StaticDemo {
 int a;
 static int b;
 void setA() {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter A: ");
	 a=sc.nextInt();
 }
 void putA() {
	 System.out.println("A: "+a);
 }
 void setB() {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter B: ");
	 b=sc.nextInt();
 }
 void putB() {
	 System.out.println("B: "+b);
 }
 public static void main(String[] args) {
	StaticDemo s1=new StaticDemo();
	StaticDemo s2=new StaticDemo();
	StaticDemo s3=new StaticDemo();
	
	s1.setA();
	s2.setA();
	s3.setA();
	
	s1.putA();
	s2.putA();
	s3.putA();
	
	s1.setB();
	s2.setB();
	s3.setB();
	
	s1.putB();
	s2.putB();
	s3.putB();
}
}
