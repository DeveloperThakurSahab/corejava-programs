//use of super with variables
class Vehicle
{
	int maxspeed=120;
}
class Car extends Vehicle
{
	int maxspeed=180;
	void display()
	{
		System.out.println("Maximum speed is: "+super.maxspeed);
	}
}

//use of super with methods
class Person
{
	void message() {
		System.out.println("This is a person class.");
	}
}
class Student1 extends Person
{
	void message() {
		System.out.println("This is a student class.");
	}
	void display() {
		message();
		super.message();
	}
}

//use of super with constructor
class P{
	P(){
		System.out.println("P class");
	}
}
class S extends P{
	S(){
		super();
		System.out.println("S class");
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		Car c=new Car();
		c.display();
		
		Student1 s=new Student1();
		s.display();
		
		S sc=new S();
	}
}
