package oops.abstraction;

public class SBI implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("SBI Saving Account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("SBI Current Account");
		
	}

	@Override
	public void debitcard() {
		System.out.println("SBI debit card");
		
	}

	@Override
	public void creditcard() {
		System.out.println("SBI credit card");
		
	}

}
