package pk3;

public class BankAccount {

	private int actNo;
	private float balance;

	public BankAccount(int actNo, float balance) {

		this.actNo = actNo;
		this.balance = balance;
	}

	public  synchronized void Withdraw(float amt) {
		float bal = this.balance;
		this.balance -= amt;
		if (this.balance >= amt) {
			System.out.println(amt + "withdeaw done, old: " + bal + "Balance:" + this.balance);
		} else {
			System.out.println(amt + " Withdraw Failed, you Don't have enough Balance, your Balance" + this.balance);
		}
	}

	public synchronized void deposit(float amt) {
		float bal = this.balance;
		this.balance += amt;

		System.out.println("DEposit Done, old: " + bal + "Balance: " + this.balance);
	}

}
