package hiearchialInheritance;

public class Subtraction extends Add {
  public void sub() {
	  int e=b-a;
	  System.out.println(e);
  }
	public static void main(String[] args) {
		Subtraction object=new Subtraction();
		object.sum();
		object.sub();
		// TODO Auto-generated method stub

	}

}
