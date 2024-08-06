package july24;

import java.util.Iterator;

public class Demo extends Thread {
	private String title;
	
	public Demo(String title) {
		this.title = title;
	
	}
	
	@Override
	public void run() {
		execute();
	}
	
	private void execute() {
		for (int i = 1; i < 11; i++) {
			System.out.println( title+ " , " + i);
			
		}
	}
	
}
