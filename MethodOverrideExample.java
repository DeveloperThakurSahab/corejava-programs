class Parent{
	void print() {
		System.out.println("Parent class");
	}
}

class subclass1 extends Parent{
	void print() {
		System.out.println("Subclass1");
	}
}

class subclass2 extends Parent{
	void print() {
		super.print();
		System.out.println("Subclass2");
	}
}
public class MethodOverrideExample {
	public static void main(String[] args) {
		subclass2 a=new subclass2();
		a.print();
	}
}
