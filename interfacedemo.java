interface ifs1{
	void meth1();
}
interface ifs2{
	void meth2();
}
interface ifs3{
	static void meth3() {
		System.out.println("meth3 defined in interface");
	}
}
interface ifs4 extends ifs3{
	void meth4();
}
public class interfacedemo implements ifs1,ifs2,ifs4{
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public void meth4() {
		System.out.println("meth4");
	}
	public static void main(String[] args) {
		interfacedemo i=new interfacedemo();
		i.meth1();
		i.meth2();
		ifs3.meth3();
		i.meth4();
	}
}
