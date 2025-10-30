package exceptionhandling;

public class ThrowandThrows {

	public static void main(String[] args) throws VotingException {
		int age=15;
		if(age>=18){
			System.out.println("Is eliglible to vote");// TODO Auto-generated method stub
		}
		else {
		throw new VotingException("Age under 18");
		}

	}

}
