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
			 throw new SuffiException("������� ���ݺ���"+(money-bankMoney)+"�� �� �����ϴ�.");
		 }
		 bankMoney-=money;
	}

}
