package userDefinedException;

public class Election {
	
	public void checkEligibility(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("You should be minimum 18 to vote");
		} else {
			System.out.println("Pleasse caste your vote");
		}
	}
	
}
