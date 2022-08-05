
public class GenericDemo {
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E e:inputArray) {
			System.out.print(" "+e);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer intArray[] = {1,2,3,4,5,6,7,8,9};
		Double doubleArray[] = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
		Character charArray[] = {'A','B','C','D','E','F','G','H','I','J','K'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}
}
