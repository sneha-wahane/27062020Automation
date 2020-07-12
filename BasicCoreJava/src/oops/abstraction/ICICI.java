package oops.abstraction;

public class ICICI implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("ICICI Saving Account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("ICICI Current Account");
		
	}

	@Override
	public void debitcard() {
		System.out.println("ICICI debit card");
		
	}

	@Override
	public void creditcard() {
		System.out.println("ICICI credit card ");
		
	}

}
