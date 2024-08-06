package pk2;

public class Pro2 {
	
public static void main(String[] args) {
	
	Demo d1 = new Demo("Harda");
	Demo d2 = new Demo ("Ujjain");
	Demo d3 = new Demo("Bhopal");
	
	Thread t1 = new Thread(d1);
	Thread t2 = new Thread(d2);
	Thread t3 = new Thread(d3);
	
	t1.start();
	t2.start();
	t3.start()
 	
	try {
		t2.join();
		t2.join(11000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("the End");
}
}
