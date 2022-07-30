package queueInterfaceTopics;

import java.util.PriorityQueue;

public class PriorityQueueRunner {

	public static void main(String[] args) {

		PriorityQueue<Integer> Pq = new PriorityQueue<Integer>();

		Pq.add(15);
		Pq.add(12);
		Pq.add(18);
		// to print top element

		System.out.println(Pq.peek());

		System.out.println(Pq.poll());
		System.out.println(Pq.peek());

	}

}
