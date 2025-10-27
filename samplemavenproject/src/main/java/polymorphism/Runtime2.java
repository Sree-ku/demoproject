package polymorphism;

public class Runtime2 extends Runtime1 {
	public void display() {
		System.out.println("Child class method");
		//super.display();
	}

	public static void main(String[] args) {
		Runtime2 object=new Runtime2();
			object.display();// TODO Auto-generated method stub

	}

}
