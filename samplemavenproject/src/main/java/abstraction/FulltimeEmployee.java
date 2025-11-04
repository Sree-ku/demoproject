package abstraction;

public class FulltimeEmployee extends Contractor{
	 int PaymentPerHour=700;
	
public void calculatesalary() {
	int hour=PaymentPerHour*8;
	System.out.println("Enter fulltime Employee:"+hour);
}
	public static void main(String[] args) {
		FulltimeEmployee obj=new FulltimeEmployee();	
    Contractor object1=new Contractor();
    obj.calculatesalary();
    object1.calculatesalary();
		// TODO Auto-generated method stub

	}

}
