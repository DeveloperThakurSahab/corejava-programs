import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(71);
		al.add(12);
		al.add(63);
		al.add(34);
		al.add(25);
		al.add(97);
		al.add(47);
		al.add(10);
		
		System.out.println("Print al");
		System.out.println(al);
		
		System.out.println("sorting");
		Collections.sort(al);
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		System.out.println("Size");
		System.out.println(al.size());
		
		System.out.println("using get");
		System.out.println(al.get(3));
		
		System.out.println("using set");
		System.out.println(al.set(0, 20));
		
		System.out.println("Print al");
		System.out.println(al);
		
		System.out.println("using Index of");
		System.out.println(al.indexOf(63));
		
		System.out.println("to find is empty or not");
		System.out.println(al.isEmpty());
		
		System.out.println("using last index");
		System.out.println(al.lastIndexOf(10));
		
		System.out.println("remove element");
		System.out.println(al.remove(3));
		
		System.out.println("using contains");
		System.out.println(al.contains(34));
		
		System.out.println("Print al");
		System.out.println(al);
	}
}
