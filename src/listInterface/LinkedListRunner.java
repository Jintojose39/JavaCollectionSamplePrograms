package listInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRunner {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();

		l.add("Bony");
		l.add("Jomy");
		l.add("Bibin");
		l.add("Bony");
		Iterator<String> itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
