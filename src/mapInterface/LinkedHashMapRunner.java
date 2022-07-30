package mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapRunner {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer,String>lm=new LinkedHashMap<Integer,String>();
		
		
		lm.put(1,"Africa");
		lm.put(2,"America");
		lm.put(3,"Saudhi");
		lm.put(4, "Africa");
		
		lm.put(null, null);
		
		
		for(Map.Entry m:lm.entrySet()) {
			System.out.println(m.getKey()+"-"+m.getValue());
		}

	}

}
