package CollectionsAPITest;
import java.util.*;
public class CollectionsAPITest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shuffleTest();
		// ����Ž���� ���ĵ� ����Ʈ����
		// �������ϴ� ���� ã���ִ¹��
		binarySearchTest();
	}
	
	public static void binarySearchTest() {
		// 1. ������ ������ ������ ����Ʈ�� ���� ����Ž�� <= �߸��� ����� ������ ���
		// 2. ���ĵ� ����Ʈ�� ���� ����Ž�� <= �̷��� ����ؾ���.
		
		Random random = new Random();
		List <Integer> list = new ArrayList<>();
		for (int i=0; i<20; i++) {
			list.add(random.nextInt(100)+1);
		}
		Collections.sort(list);
		// ������ �Ǿ��־���� ����
		System.out.println(list);
		
		int idx = Collections.binarySearch(list, 32);
		if(idx>=0) {
			System.out.println((idx+1) +"��°�� �ֽ��ϴ�");
		}
		else {
			System.out.println(idx);
			System.out.println("ã�����ϴ� ���� ����Ʈ�� �����ϴ�");
		}
	}
	
	
	
	
	public static void shuffleTest() {
		
		//	����Ʈ ������ ����Ʈ�� �� ������	
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<10; i++) {
			list.add((i+1)*1);
		}
		
		//����Ʈ2 ������ ����Ʈ�� �� ������	
		ArrayList <Student> list2 = new ArrayList<>();
		for (int i=0;i<10;i++) {
			Student std = new Student();
			std.grade = (i+1)*100;
			list2.add(std);
		}
		
		//	���� �� ����Ʈ ���
		System.out.println("���� ��");
		System.out.println(list);
		System.out.println(list2);
		
		//	���� �÷���
		Collections.shuffle(list);
		Collections.shuffle(list2);
		
		//	���� �� ����Ʈ ���
		System.out.println("���� ��");
		System.out.println(list);
		System.out.println(list2);
	}

}



