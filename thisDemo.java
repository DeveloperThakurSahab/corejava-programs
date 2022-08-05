class Student
{
	int rno;
	String sname;
	public Student() {
		System.out.println("Default Constructor");
	}
	public Student(int rno, String sname) {
		this();
		System.out.println("Parameterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
	void show(Student s) {
		System.out.println("Roll No: "+s.rno);
		System.out.println("Sname: "+s.sname);
	}
	void display()
	{
		this.show(this);
	}
}
public class thisDemo {
	public static void main(String[] args) {
		Student s1=new Student(1,"Jigar");
		s1.display();
	}
}
