class one{
	void put(){
		System.out.println("Hey! I'm Ankush.");
	}
}
class two extends one{
	void show(){
		System.out.println("I'm a Programmer.");
	}
}
class three extends two{
	void display() {
		System.out.println("This is an example of multilevel inheritance.");
	}
}
public class InheritDemo {
	public static void main(String[] args) {
		three t=new three();
		t.put();
		t.show();
		t.display();
	}
}
