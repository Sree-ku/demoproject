package abstraction;

public  class Abstraction2 extends Abastract1 {

	public static void main(String[] args) {
	 // Abastract1 object=new Abastract1();	// TODO Auto-generated method stub
       Abstraction2 object1=new Abstraction2();
       object1.sum();
       object1.display();
       object1.display1();
	}

	@Override
	public void sum() {
		int a=5+7;
		System.out.println(a);// TODO Auto-generated method stub
		
	}
	public void display1() {
		
		System.out.println("Child class");
	}

}
