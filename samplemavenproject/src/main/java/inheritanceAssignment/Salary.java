package inheritanceAssignment;

public class Salary extends Employee{
	double hra,pf;
	public void display() {
		hra=basicpay*0.05;
		pf=basicpay*0.20;
		System.out.println("Enter the Hra:"+hra);
		System.out.println("Enter the Pf:"+pf);
	}

}
