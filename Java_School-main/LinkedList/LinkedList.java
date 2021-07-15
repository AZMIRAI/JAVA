package LinkedList;

import java.util.Iterator;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {		
		test1();
	}

	private static void test1() {
		List<String> list = new LinkedList<>();
		String [] sArr = {"�ڵ���","���","��ġ��","�б�","Ȳ�뿵"};
//		list.add("�ڵ���")
		for (String s : sArr) list.add(s);	// for each ��	
		System.out.println(list); // ArrayList�� toString()�޼ҵ尡 �̿��
		
		for (int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println(); 
		
		for (String s : list) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		Iterator<String> iter = list.iterator();
			while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
			}
			
		System.out.println();
			// �� �ڵ� �� {}�� �����ʾƵ� �ɱ�?
			// unchecked exception�� ���״�.
			// �̷� exception ��ü�� �߻����� �ʰ� �ڵ��ض�
			
			// overloading�� add �޼ҵ�� �����ո� �߰��� ���� �� ���ִ�
		list.add(1,"����");
			// �迭 ����Ʈ�� �߰�
		iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
			//hasNext �� �ٽ� ��������� iter = list.iterator�� �ٽ��ؾ�
		
		System.out.println();
			// �迭�� ���� �� �� �ִ� �޼ҵ�
//		list.remove() ;
		
			// ������ ���� �����ϰ������?
			// ���Ҽ� -1
		
//		list.remove(list.size()-1);
//		
//		while(list.size()>0) {
//			list.remove(0);
//		}
		// 1��, ù��° ���Ҹ� 1�� �����ȴ�. 2�� �� �����ȴ�.
		
		list.remove(3); // �׹�° ���� ����
		System.out.println(list);
	
	
	
	
	
	}
}
