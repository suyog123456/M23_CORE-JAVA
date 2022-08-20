package com.cg.collection;
//example on queue
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(12);
		q.add(19);
		q.add(25);
		q.add(10);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		

	}

}