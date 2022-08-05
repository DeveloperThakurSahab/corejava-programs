class Box{
	double width,height,depth;
	Box(){
		System.out.println("Defult Constructor is Called.");
		width = 3;
		height = 4;
		depth = 5;
	}
	void volume() {
		System.out.println("Volume is: "+(width*height*depth));	
	}
	Box(double w,double h, double d){
		System.out.println("Parameterized Constructor is Called.");
		width = w;
		height =h;
		depth = d;
	}
	Box(Box b){
		System.out.println("Copy Constrructor is Called.");
		width = b.width;
		height = b.height;
		depth = b.depth;
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume();
		Box b2=new Box(4,5,6);
		b2.volume();
		Box b=new Box(b2);
		b.volume();
	}
}
