package singleinheritance;

public class Subtraction extends Inheritanceexample{
	int a=20;
	public Subtraction() {
		super("hello");
		System.out.println("Child class constuctor");
	}
	public void sub() {
		//super.sum();
		int d=b-a;
		System.out.println(d);
		System.out.println("The value of a:"+super.a);

	}

	public static void main(String[] args) {
	      	Subtraction object1=new Subtraction();
		//object1.sum();
		//object1.sub();// TODO Auto-generated method stub

	}

}
