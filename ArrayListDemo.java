import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(10.10);
		al.add("tops");
		al.add('t');
		al.add(true);
		al.add(null);
		al.add(10);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(3));
		System.out.println(al.set(2,"technologies"));
		System.out.println(al.indexOf(true));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.remove(3));
		System.out.println(al.contains('t'));
		System.out.println(al);
	}
}
