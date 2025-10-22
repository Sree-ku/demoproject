package hiearchialInheritance;

public class Multiplication extends Add {
	 public void multiple() {
		 int f=a*b;
		 System.out.println(f);
		 
	 }

	public static void main(String[] args) {
		Multiplication object1=new Multiplication();
		object1.multiple();
	
		// TODO Auto-generated method stub

	}
}
