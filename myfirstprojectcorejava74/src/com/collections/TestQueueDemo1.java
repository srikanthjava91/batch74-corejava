package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo1 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<>();
//		q1.offer(1);//true if the element was added to this queue, else false
//		q1.offer(3);
//		q1.offer(2);
//		q1.offer(4);
//		q1.offer(5);
		System.out.println(q1);
		//Retrieves and removes the head of this queue, or returns null if this queue is empty.
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		
//		add() --> Inserts the specified element into this queue 
//		if it is possible to do so immediately without violating capacity restrictions, 
//		returning true upon success and 
//		throwing an IllegalStateException if no space is currently available.
		
		
//		remove() -> If the queue is empty, but trying to remove the elements from the queue 
//		then we will get NoSuchElementException 
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(1);

		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.element());
		System.out.println(q);

	}

}
