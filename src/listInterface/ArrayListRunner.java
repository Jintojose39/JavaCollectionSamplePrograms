package listInterface;

import java.util.ArrayList;
import java.util.Iterator;






public class ArrayListRunner {

	public static void main(String[] args) {
		
		
		ArrayList<String>list=new ArrayList<String>();
		
		
		list.add("Jinto");
		list.add("Shiju");
		list.add("Bony");
		list.add("Evan");
		list.add("Jinto");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

		
		
		