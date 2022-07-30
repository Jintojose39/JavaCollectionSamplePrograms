package listInterface;

import java.util.Iterator;
import java.util.Stack;

public class StackRunner {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();

		s.push("Jinto");
		s.push("Bony");
		s.push("Akhil");
		s.push("Akhil");

		// to remove last method we use pop method in stack

		s.pop();

		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
