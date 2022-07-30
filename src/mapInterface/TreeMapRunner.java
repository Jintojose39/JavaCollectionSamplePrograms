package mapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapRunner {

	public static void main(String[] args) {
		
		
		Map<Integer,String>tm=new TreeMap<Integer,String>();
		
		tm.put(1,"Poland");
		tm.put(2,"India");
		tm.put(3,"Africa");
		//tm.put(null, null);
		
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		
		
		
		
		

	}

}
