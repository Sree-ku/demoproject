package accessModified;

public class Accessmodified1 {
	public int a=5;
	private int b=10;
	int c=5;
	protected int d=20;
	public void publicmethod() {
		System.out.println("This is public method");
		
	}
	private void privatemethod() {
		System.out.println("This is private method");
	}
	void defaultmethod() {
		System.out.println("This is default method");
	}
	protected void protectedmethod() {
		System.out.println("This protected method");
		
	}

   public static void main(String[] args) {
		Accessmodified1 object1=new Accessmodified1();
		/*object1.publicmethod();
		object1.privatemethod();
		object1.defaultmethod();
		object1.protectedmethod();
		// TODO Auto-generated method stub
*/
	}

}
