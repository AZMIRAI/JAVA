package Stack;
import java.util.*;
public class StackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple, banana, carrot, pineapple, grape, mango, strawberry, watermelon, melon, orange, coconut, kiwi, lemon, tomato, cherry, blueberry, peach, cramberry, raspberry"; 
	
		/*	String s = str.substring(0,"apple".length());
			System.out.println(s);
	
		 	���� ���ڸ� �������� �ϳ��� �߶��ּ���
		 	�����ڸ� �Է����� �ְ�, �� ������(delimiter)�� ���еǴ� ���ڿ����� �ϳ��� 
		 	�ϳ��� �̾� �� �� �ְ� ���ִ� java.util ��Ű���� Ŭ������ �����ϸ� 
		 	StringTokennizer
		*/
		
		StringTokenizer st = new StringTokenizer(str ,", ");
//		String s = st.nextToken();
//		System.out.println(s);
		
		System.out.println(st.countTokens()+"\n");
		/*
		��ū�� �� ���� ��� 1
		��ū�� �� ��ŭ for �� ����..
		
		��ū�� �� ���¹�� 2
		���� ������ �� ��ū�� �����ִ��� ����� 
		������ nextToken()�޼ҵ� ȣ���ؼ� �ϳ��� �޾Ƽ� ����ϱ�
		
		�ַ� �ι�° ����� ���� ����Ѵ�
		*/
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("[" + token + "]");
		}
	}

}
