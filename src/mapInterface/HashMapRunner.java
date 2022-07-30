package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// to add here we use put

		hm.put(1, "India");
		hm.put(2, "USA");
		hm.put(3, "Germany");
		hm.put(4, "UK");
		hm.put(null, null);

		for (Map.Entry m : hm.entrySet()) {

			System.out.println(m.getKey() + "-" + m.getValue());

		}

		System.out.println(hm);
	}

}
