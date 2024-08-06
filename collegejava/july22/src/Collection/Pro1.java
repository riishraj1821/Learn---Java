package Collection;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Pro1 {
	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<>();
	//	ArrayList<String> l2 = new ArrayList<>(45);
		
		l1.add("vikas");
		l1.add("lokesh");
		l1.add("meena");
		
//		for (int i = 0; i < l1.size(); i++) {
//			System.out.println(l1.get(i));
//		}	
//		for (String s:l1) {
//			System.out.println(s);
//		}
		
//		l1.forEach(new Consumer<String>() {
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		
		l1.forEach(t->System.out.println(t));
	}
}
