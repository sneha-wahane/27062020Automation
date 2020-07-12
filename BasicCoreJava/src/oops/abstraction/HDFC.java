package oops.abstraction;

public class HDFC implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("HDFC Saving Account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC Current Account");
		
	}

	@Override
	public void debitcard() {
		System.out.println("HDFC debit card");
		
	}

	@Override
	public void creditcard() {
		System.out.println("HDFC credit card");
		
	}

}
