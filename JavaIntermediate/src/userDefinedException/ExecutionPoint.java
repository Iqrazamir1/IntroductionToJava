package userDefinedException;

public class ExecutionPoint {
	public static void main(String[] args) {
		
		Election obj = new Election();
		
		try {
			obj.checkEligibility(19);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		CheckCreditCard obj1 = new CheckCreditCard();
		
		try {
			obj1.check("7548758397582758329752");
		} catch (CreditCardException e) {
			e.printStackTrace();
		}

	}
}
