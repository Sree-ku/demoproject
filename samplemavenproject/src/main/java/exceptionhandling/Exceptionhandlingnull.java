package exceptionhandling;

public class Exceptionhandlingnull {

	public static void main(String[] args) {
		System.out.println("Before exception");
		try {
			
		
		String a=null;
		System.out.println(a.length());
	// TODO Auto-generated method stub
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("After exception");
		}
	}

}
