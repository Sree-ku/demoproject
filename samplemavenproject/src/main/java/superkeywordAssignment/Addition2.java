package superkeywordAssignment;

public class Addition2 extends Addition1{
	
 public void display(int a,int b) { 
	
	int num=super.sum(a,b);
 
 if(num%10==0) {
	 System.out.println("Is divisible by 10");
 }
 else {
	 System.out.println("Is not divisible by 10");
 }
 }
	public static void main(String[] args) {
		Addition2 obj=new Addition2();
		obj.display(20,40);// TODO Auto-generated method stub

	}

}
