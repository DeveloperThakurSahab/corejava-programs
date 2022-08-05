/*
 * Polymorphism: One name multiple form.
 * 
 * 1.Compile Time: 
 * Method Overloading: When there is more than one method in a single class having the same name but with different number of 
 * arguments and their data types then it is called method overloading.
 * 
 * 2.Run Time:
 * Method Overide:when there is same prototype in your both base class and derived class, 
 * and if you call that method using the object of derived class then only derived class method will be called, 
 * so you can say that method of derived class overrides the method of base class.
 * 
 * Super: Using super keyword you can access variables,methods and constructor from your derived class to your immediate base class.
 * */
class A2{
	A2()
	{
		System.out.println("A2's Constructor");
	}
	void show() {
		System.out.println("Show From A2");
	}
}
class B2 extends A2{
	B2()
	{
		System.out.println("B2's Constructor");
	}
	void show() {
		super.show();
		System.out.println("Show From B2");
	}
}
class C2 extends B2{
	C2()
	{
		System.out.println("C2's Constructor");
	}
	void show() {
		super.show();
		System.out.println("Show From C2");
	}
}
public class MethodOverrideDemo {
	public static void main(String[] args) {
		C2 c=new C2();
		c.show();
	}
}