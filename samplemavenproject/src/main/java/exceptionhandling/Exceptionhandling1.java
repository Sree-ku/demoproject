package exceptionhandling;

import java.beans.Expression;

public class Exceptionhandling1 {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int c=a/b;// TODO Auto-generated method stub

	}
		catch(ArithmeticException d) {
			System.out.println(d);
			
			
		}
		finally {
			System.out.println("Exception");
		}
			
		}

}
