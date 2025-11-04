package polymorphism;

public class Offseason extends Onseason{
	
public void discount(double price) {
	price=price*0.15;
	System.out.println("Enter the offseason:"+price);
	
}
	public static void main(String[] args) {
		Offseason object=new Offseason();
		Onseason obj=new Onseason();
		object.discount(1000);// TODO Auto-generated method stub
		obj.discount(1000);
	}

}
