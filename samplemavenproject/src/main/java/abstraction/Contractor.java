package abstraction;

public class Contractor extends Employee {



      int PaymentPerHour = 500;
      int WorkingHours=7;
      

	@Override
	public void calculatesalary() {
		int salary=PaymentPerHour*WorkingHours;
		System.out.println("Enter the Contractor:"+salary);
		// TODO Auto-generated method stub
		
	}

}
