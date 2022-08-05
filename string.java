
public class string {
	public static void main(String[] args) {
		String greeting ="Hello";
		System.out.println(greeting);
		
		//to find length of string
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt is: "+ txt.length());
		
		//to change into uppercase or lowercase
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());
		System.out.println(txt1.toLowerCase());
		
		//to find index of any text in string
		String txt2 = "Please locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate"));
		
		//string concatenation
		String firstname = "John";
		String lastname = "Doe";
		System.out.println(firstname + " " + lastname);
		System.out.println(firstname.concat(lastname));
		
		//string concatenation with int
		String x ="10";
		String y ="20";
		String z =x+y;
		System.out.println(z);
		
		int a = 20;
		String b = x+a;
		System.out.println(b);
		
		//string special characters for double qoutes
		String c = "We are the so-called \"Vikings\" from the north.";
		System.out.println(c);
		
		//string special characters for single qoutes
		String d = "It\'s alright.";
		System.out.println(d);
		
		//string special characters for backslash
		String e = "The character \\ is called backslash.";
		System.out.println(e);
	}
}
