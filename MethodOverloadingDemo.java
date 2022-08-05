public class MethodOverloadingDemo {
	void test() {
		System.out.println("test with no argument");
	}
	void test(int a) {
		test();
		System.out.println("test with one argument");
	}
	void test(int a, int b) {
		System.out.println("test with two argument");
	}
	public static void main(String[] args) {
		MethodOverloadingDemo m=new MethodOverloadingDemo();
		m.test(10);
		m.test();
		m.test(20, 30);
	}
}
