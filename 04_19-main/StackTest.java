package Stack;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Stack : LIFO (Last In First Out)
			Generic :	Ŭ���� ���ο��� ����� ������ Ÿ���� ���������� �ƴϰ� 
						�� Ŭ���� ��ü�� �����Ҷ� ���� �� �� �ֵ���
						����� ������ Ÿ���� �Ķ���ͷ� �޾Ƽ� ��ü�� �����ϴ°�
			Ÿ�� �Ķ���� (Type Parameter) 
		 */
		
		Stack <Integer> stack = new Stack();
		// ���׸�Ÿ������  ������Ƽ�� Ÿ�� �����ʴ´�
		// int boolean long float short byte char
		
		for (int i=0; i<10; i++) { 
			 stack.push(i+1); //queue.add(i+1);
		}
		
		System.out.println(stack+"\n");
		// 10 9 8 7 6 5 4 3 2 1 
		
		while(!stack.isEmpty()) {
			Integer val = stack.pop();
			System.out.println(val);	
		}
	
	}
}
