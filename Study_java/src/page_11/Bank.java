package page_11;

public class Bank {
	private int bankMoney;

	public int getBankMoney() {
		return bankMoney;
	}
	public void add(int money) {
		bankMoney+=money;
	}
	public void withdraw(int money) throws SuffiException {
		 if(bankMoney<money) {
			 throw new SuffiException("인출금이 원금보다"+(money-bankMoney)+"원 더 많습니다.");
		 }
		 bankMoney-=money;
	}

}
