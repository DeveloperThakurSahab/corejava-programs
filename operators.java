/* Java divides the operators into the following groups:
 * 1) Airthmetic 
 * 2) Assignment
 * 3) Comparison
 * 4) Bitwise
 * 
 * Airthmetic operators are +, -, *, /, %, ++, --*/
public class operators {
	public static void main(String[] args) {
		int x = 100 + 50;
		System.out.println(x);
		
		int sum1 = 100 + 50;
		int sum2 = sum1 + 250;
		int sum3 = sum2 + sum2;
		System.out.println("the value of sum1 is: "+ sum1);
		System.out.println("the value of sum2 is: "+ sum2);
		System.out.println("the value of sum3 is: "+ sum3);
		
		int a=5,b=3;
		System.out.println("Addition is: "+ (a+b));
		System.out.println("Subtraction is: "+ (a-b));
		System.out.println("Multiplication is: "+ (a*b));
		System.out.println("Division is: "+ (a/b));
		System.out.println("Modulous is: "+ (a%b));
		//Increment
		++a;
		System.out.println(a);
		//Decrement
		--b;
		System.out.println(b);
	}
}
