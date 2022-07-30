package listInterface;

import java.util.Iterator;
import java.util.Vector;

public class VectorRunner {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		v.add("Jinto");
		v.add("Lijo");
		v.add("Binil");
		v.add("Jinto");

		Iterator<String> itr = v.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
