package Stack;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Stack : LIFO (Last In First Out)
			Generic :	클래스 내부에서 사용할 데이터 타입이 정해진것이 아니고 
						그 클래스 객체를 생성할때 결정 할 수 있도록
						사용할 데이터 타입을 파라미터로 받아서 객체를 생성하는것
			타입 파라미터 (Type Parameter) 
		 */
		
		Stack <Integer> stack = new Stack();
		// 제네릭타입으론  프리미티비 타입 되지않는다
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
