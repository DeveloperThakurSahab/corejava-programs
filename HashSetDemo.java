import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(10.10);
		hs.add("tops");
		hs.add('t');
		hs.add(true);
		hs.add(null);
		hs.add(10);
		
		System.out.println(hs);
		System.out.println(hs.contains("tops"));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(3));
		System.out.println(hs);
	}
}
