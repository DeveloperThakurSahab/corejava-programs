import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
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
		System.out.println("using iterator");
		Iterator itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("using list iterator");
		ListIterator litr= al.listIterator();
		while(litr.hasNext())
		{
			litr.set(litr.next()+ "Java");
		}
		
		litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("using list iterator previous");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}
}