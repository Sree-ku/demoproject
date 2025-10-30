package exceptionhandling;

public class Multiplecatchexception {

	public static void main(String[] args) {
		try{
			int a=5;
			int b=0;
			int c=a/b;
		// TODO Auto-generated method stub
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(ArithmeticException d) {
			System.out.println(d);
		}
		catch(Exception f) {
			System.out.println(f);
		}
		finally {
			System.out.println("Multiple catch exception");
		}

	}

}
