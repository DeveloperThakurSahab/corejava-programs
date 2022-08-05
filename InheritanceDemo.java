import java.util.Scanner;

class A{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
	}
	void putA() 
	{
		System.out.println("A is: "+a);
	}
}
class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B: ");
		b=sc.nextInt();
	}
	void putB() 
	{
		System.out.println("B is: "+b);
	}
}
class C extends B
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C: ");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C is: "+c);
	}
}
class D extends A{
	int d;
	void getD()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter D: ");
		d=sc.nextInt();
	}
	void putD()
	{
		System.out.println("D is: "+d);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		C b1=new C();
		D d1=new D();
		b1.getA();
		b1.getB();
		b1.getC();
		b1.putA();
		b1.putB();
		b1.putC();
		d1.getA();
		d1.getD();
		d1.putA();
		d1.putD();
	}
}
