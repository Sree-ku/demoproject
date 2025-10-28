package interfacepackage;

public class Interface2 implements Interface1 {

	public static void main(String[] args) {
		Interface1 object =new Interface2();
		object.display();// TODO Auto-generated method stub
		//object.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("Interface example");	
	}
	/*public void show() {
		System.out.println("Interface package");
	}*/

}
