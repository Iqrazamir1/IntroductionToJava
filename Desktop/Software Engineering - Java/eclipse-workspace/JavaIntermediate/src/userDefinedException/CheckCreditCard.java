package userDefinedException;

public class CheckCreditCard {
	
	public void check(String checkNumber) throws CreditCardException {
		if(checkNumber.length() > 16) {
			throw new CreditCardException("Invalid credit card");
		} else {
			System.out.println("Payment completed");
		}
	}

}
