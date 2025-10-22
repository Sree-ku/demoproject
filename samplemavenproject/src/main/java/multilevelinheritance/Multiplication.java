package multilevelinheritance;

public class Multiplication extends Subtraction{
  public void multiple() {
	  int d=a*b*c;
	  System.out.println(d);
  }
	public static void main(String[] args) {
		Multiplication object1=new  Multiplication();
		object1.sum();
		object1.sub();
		object1.multiple();// TODO Auto-generated method stub

	}

}
