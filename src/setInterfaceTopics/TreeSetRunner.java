package setInterfaceTopics;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetRunner {

	public static void main(String[] args) {
		
		
		TreeSet<String>ts=new TreeSet<String>();
		
		
		ts.add("David");
		ts.add("Shiju");
		ts.add("Jinto");
		ts.add("Zahir");
		ts.add("Jinto");
		
		//ts.add(null);
		
		Iterator<String>itr =ts.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
	}

}
