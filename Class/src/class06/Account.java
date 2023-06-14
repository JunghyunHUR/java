package class06;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int Max_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance <= Account.MIN_BALANCE || balance >= Account.Max_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	
}
