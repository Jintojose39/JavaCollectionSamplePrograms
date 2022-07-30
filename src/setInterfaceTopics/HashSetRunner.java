package setInterfaceTopics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRunner {

	public static void main(String[] args)  {
		
		
		HashSet<String>hs=new HashSet<String>();
		
		hs.add("Jinto");
		hs.add("Shiju");
		hs.add("Bony");
		hs.add("Jinto");
		
		Iterator<String>itr=hs.iterator();
		
		
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
