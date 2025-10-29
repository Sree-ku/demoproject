package inheritanceAssignment;

public class Totalsalary extends Salary {
	double total;
	public void getsalaryslip() {
		total=basicpay+hra-pf-deducation+bonus;
		System.out.println("Total salary by hand:"+total);
		
	}

	public static void main(String[] args) {
		Totalsalary obj=new Totalsalary();
		obj.getdetails();
		obj.display();
		obj.getsalaryslip();
		// TODO Auto-generated method stub

	}

}
