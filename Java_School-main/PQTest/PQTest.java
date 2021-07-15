package PQTest;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			test1();
	}

	public static void test1() {
		Queue<String> q = new PriorityQueue<>();
		q.offer("PineApple"); //q.add ÇØµµµÊ
		q.offer("Banana");
		q.offer("Carrot");
		q.offer("Cherry");
		q.offer("Strawberry");
		
		// ¿³º¸±â, ÀÎÃâÀº ¾Æ´Ô
		System.out.println(q.peek()); //q.element() ÇØµµµÊ
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println("###########");
		
		while(q.size() > 0) {
			System.out.println(q.poll()); //q.remove() »©µµµÊ
		}
		System.out.println("###########");
		
		// QUEUE ´Ù¸¥ ¿¹Á¦·Î ÇÑ´Ù°í ÇÏ½É
	}
}
