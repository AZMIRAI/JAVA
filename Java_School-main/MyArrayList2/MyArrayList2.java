package MyArrayList2;

import java.util.ArrayList;

public class MyArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
	
		for (int i = 0; i < 10; i++) {
			list.add(i);
			
		}
		System.out.println(list);
		
		list.add(3,100); // 3�ڸ��� 100�� �߰������� �ڿ��Ŵ� �з���
		System.out.println(list);
//		list.remove(3); //3�ڸ��� �����ص� ������ �������� ���ڸ� ������ �и�
		list.remove(Integer.valueOf(100)); //�Ȱ��� �����Ŷ�
		System.out.println(list);
	}
}
