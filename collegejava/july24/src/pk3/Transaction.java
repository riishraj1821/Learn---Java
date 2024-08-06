package pk3;

public class Transaction extends Thread {
	
	public static final int MODE_WITHDRAW  = 1;
	public static final int MODE_DEPOSIT = 2;
	private BankAccount act;
	private float amount;
	private int mode;
	
	
	public Transaction(BankAccount act, float amount, int mode) {
		
		this.act = act;
		this.amount = amount;
		this.mode = mode;
	}


	public void run() {
		if(this.mode==MODE_WITHDRAW)
			this.act.Withdraw(this.amount);
		else
			this.act.deposit(this.amount);

	}
}
