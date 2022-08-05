class Helper{
	static int Multiply(int a, int b) {
		return a*b;
	}
	static double Multiply(double a, double b) {
		return a*b;
	}
}

class Help{
	static int Multiply(int a, int b) {
		return a*b;
	}
	static int Multiply(int a, int b, int c) {
		return a*b*c;
	}
}
public class MethodOverExample {
	public static void main(String[] args) {
		System.out.println(Helper.Multiply(2, 3));
		System.out.println(Helper.Multiply(5.5, 6.6));
		System.out.println();
		System.out.println(Help.Multiply(3, 4));
		System.out.println(Help.Multiply(5, 6, 7));
	}
}
