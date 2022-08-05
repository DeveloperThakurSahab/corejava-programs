/*
 * Final Keyword
 * 
 * -Final Keyword is used to declare variables, methods and class.
 * -If you declare variable as a final you can't change it's value.
 * -If you declare method as a final then you can't override it.
 * -If you declare class as a final then you can't inherit it.
 * */
class final1
{
	int a=10,b;
	final int c=10;
	final int d;
	public final1(){
		d=10;
	}
	void show() {
		a=20;
		b=30;
	}
}
class final2 extends final1
{
	void show() {
		
	}
}
public class FinalDemo {

}
