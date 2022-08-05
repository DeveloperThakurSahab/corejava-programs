class First{
	void printA() {
		System.out.println("Class A");
	}
}
class Second extends First{
	void printB() {
		System.out.println("Class B");
	}
}
class Third extends First{
	void printC() {
		System.out.println("Class C");
	}
}
class Four extends First{
	void printD() {
		System.out.println("Class D");
	}
}
public class hierarchicaldemo {
	public static void main(String[] args) {
		Second s=new Second();
		s.printA();
		s.printB();
		Third t=new Third();
		t.printA();
		t.printC();
		Four f=new Four();
		f.printA();
		f.printD();
	}
}
