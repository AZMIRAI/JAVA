package Deque;

import java.util.*;

public class DequeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Deque는 인터페이스
		 *  이것을 구현한 구현 클래스는
		 *  ArrayDeque.
		 *  인터페이스의 인스턴스 생성은 안됨
		 */
		
		Queue <Integer> queue = new ArrayDeque<Integer>();
		
		/*
		  Queue : a, b 메소드 있다면
		  ArrayDeque : a,b,c,d,e 메소드 가능? 가능함
		
		 q.a(),q.b() 됨
		 q.c() << 안됨
		
		 1. Queue에 임의의 수 10개를 넣고
		 2. 안에 어떤 순서로 들어 가 있는지 보고
		 3. 하나씩 인출해보자 . <= FIFO 순으로 나오는지 확인
		 */
		 
		 for (int i=0; i<10; i++) 
			 queue.offer(i+1); //queue.add(i+1);
	
	
		 System.out.println(queue+"\n");
		 
		 
		 /* [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
		 	poll 메소드로 하나씩 인출, FIFO 순으로 나와야한다
		 	1,2,3 ~ 10
		 	큐에 원소가 있으면 인출하자..
		*/
		 
		while (/*queue.size() > 0		*/
			   /*queue.isEmpty()==false */
			   !queue.isEmpty()){
			// Integer val = queue.poll(); // Queue의 Size가 1씩 감소.
			   Integer val = queue.remove();
			   System.out.println(val);
		}
		
		// Queue 는 for로 값을 빼면 빼는순간 사라진다
		// stack 도 사라짐
		
		System.out.println("\nQueue의 상태");
		System.out.println(queue);
	
	}
	
}
