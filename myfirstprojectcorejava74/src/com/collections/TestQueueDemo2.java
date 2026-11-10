package com.collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo2 {

	public static void main(String[] args) {

		Queue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
		
		q1.offer(5);
		q1.offer(4);
		q1.offer(3);
		q1.offer(2);
		q1.offer(1);
		q1.offer(0);
		
		System.out.println(q1);
		

	}

}
