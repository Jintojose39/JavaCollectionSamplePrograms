package queueInterfaceTopics;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRunner {

	public static void main(String[] args) {
		
		
		Deque<String>dq=new ArrayDeque<String>();
		
		dq.add("Bony");
		dq.add("Jinto");
		dq.add("Jobin");
		dq.add("Shiju");
		
		for(String dq1:dq) {
			
			System.out.println(dq1);
			
		}
		//here we remove a string
		
		dq.remove("Jinto");
		System.out.println("After removing a string");
		System.out.println(" ");
		for(String dq1:dq) {
			
			System.out.println(dq1);
		}
		
		
		
		

	}

}
