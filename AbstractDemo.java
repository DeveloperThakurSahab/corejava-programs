abstract class RBI
{
	void show() {
		System.out.println("I am RBI");
	}
	abstract void ROI(double roi);
}
class SBI extends RBI
{
	void ROI(double roi) {
		System.out.println("SBI's Interest Rate: "+roi);
	}
}
class BOI extends RBI
{
	void ROI(double roi) {
		System.out.println("BOI's Interest Rate: "+roi);
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		SBI s=new SBI();
		BOI b=new BOI();
		
		s.show();
		s.ROI(6.5);
		b.show();
		b.ROI(6.1);
	}
}