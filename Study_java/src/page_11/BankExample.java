package page_11;

public class BankExample {

	public static void main(String[] args) {
	 Bank bank = new Bank();
	 bank.add(10000);
	 int cash = bank.getBankMoney();
	 System.out.println("����:"+cash);
	 try {
		bank.withdraw(300);
		cash = bank.getBankMoney();
		System.out.println("����:"+cash);
	} catch (SuffiException e) {
		System.out.println(e.getMessage());
	}

	}

}
