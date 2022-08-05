/* 
 * At first the static block will be compiled before main method because of static keyword.
 * And the normal blocks are called when the object of class is created.(In Top-Down Approach)
 * If you create object of class before calling static method it will be shown before.
 * */
public class StaticMethod {
	static int a=10;
	static int b;
	
	{
		System.out.println("Block 1");
	}
	
	static void math(int x)
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	
	static
	{
		System.out.println("Static Block Initialize");
		b=a*4;
	}
	
	{
		System.out.println("Block 2");
	}
	
	public static void main(String[] args) {
		math(20);
		StaticMethod s=new StaticMethod();
	}
}
