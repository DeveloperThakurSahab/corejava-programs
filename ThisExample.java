class Test{
	int a,b;
	Test(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void display() {
		System.out.println("a = "+a+" b = "+b);
	}
}

class Test1{
	int x,y;
	Test1()
	{
		this(30,40);
		System.out.println("Inside default constructor");
	}
	Test1(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("Inside parameterized constructor");
	}
}
public class ThisExample {
public static void main(String[] args) {
	Test obj=new Test(10,20);
	obj.display();
	
	Test1 ob=new Test1();
}
}
