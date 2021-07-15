package Deque;

import java.util.*;

public class DequeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Deque�� �������̽�
		 *  �̰��� ������ ���� Ŭ������
		 *  ArrayDeque.
		 *  �������̽��� �ν��Ͻ� ������ �ȵ�
		 */
		
		Queue <Integer> queue = new ArrayDeque<Integer>();
		
		/*
		  Queue : a, b �޼ҵ� �ִٸ�
		  ArrayDeque : a,b,c,d,e �޼ҵ� ����? ������
		
		 q.a(),q.b() ��
		 q.c() << �ȵ�
		
		 1. Queue�� ������ �� 10���� �ְ�
		 2. �ȿ� � ������ ��� �� �ִ��� ����
		 3. �ϳ��� �����غ��� . <= FIFO ������ �������� Ȯ��
		 */
		 
		 for (int i=0; i<10; i++) 
			 queue.offer(i+1); //queue.add(i+1);
	
	
		 System.out.println(queue+"\n");
		 
		 
		 /* [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
		 	poll �޼ҵ�� �ϳ��� ����, FIFO ������ ���;��Ѵ�
		 	1,2,3 ~ 10
		 	ť�� ���Ұ� ������ ��������..
		*/
		 
		while (/*queue.size() > 0		*/
			   /*queue.isEmpty()==false */
			   !queue.isEmpty()){
			// Integer val = queue.poll(); // Queue�� Size�� 1�� ����.
			   Integer val = queue.remove();
			   System.out.println(val);
		}
		
		// Queue �� for�� ���� ���� ���¼��� �������
		// stack �� �����
		
		System.out.println("\nQueue�� ����");
		System.out.println(queue);
	
	}
	
}
