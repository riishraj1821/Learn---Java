package pk3;

public class Pro1 {
  public static void main(String[] args) {
	BankAccount act = new BankAccount(1231, 75000);
	
	Transaction t1 =  new Transaction(act, 10000, Transaction.MODE_WITHDRAW);
	Transaction t2 =  new Transaction(act, 9000, Transaction.MODE_WITHDRAW);
	Transaction t3 =  new Transaction(act, 8000, Transaction.MODE_WITHDRAW);
	Transaction t4 =  new Transaction(act, 7000, Transaction.MODE_WITHDRAW);
	Transaction t5 =  new Transaction(act, 6000, Transaction.MODE_WITHDRAW);
	Transaction t6 =  new Transaction(act, 19500, Transaction.MODE_WITHDRAW);
	Transaction t7 =  new Transaction(act, 15000, Transaction.MODE_WITHDRAW);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
}
}
