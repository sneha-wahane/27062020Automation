package oops.abstraction;

public class BankUser {

	public static void main(String[] args, RBI bank) {
		
		account(new SBI());//SBI==chrome
		account(new HDFC());//HDFC==Firefox
		account(new ICICI());//ICICI==EDge
		
		message("Sneha");
		sum(20);
		account(bank);
		String name="anand";
		int a=10;
		RBI bank1=new SBI();
				
		}
	public static void account(RBI bank)//RBI==WebDriver
	{
		bank.creditcard();//navigate
		 bank.currentAccount();//select option
		 bank.debitcard();//enter data
		 bank.savingAccount();//click
	}
	public static void sum(int a)
	{
		System.out.println(10+a);
		
	}
	public static void message(String name)
	{
		System.out.println("Your name is:"+ name);
	}
	
	

}
