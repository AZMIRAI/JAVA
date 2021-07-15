package SetTest;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
//		test1();
		test2();
	}
	
	
	//Conperator ����
	public static void test2() {
		// hashset�� �Է� �� ������� �����
		List <Integer> list = Arrays.asList(10,9,5234,8,6,5,4,3,2);
//		Set<Integer >set1 = new LinkedHashSet<>();
		MyComparator mc = new MyComparator(); 
//		Set<Integer> set1 = new TreeSet<>(); //���ĵǼ� ����
		Set<Integer> set1 = new TreeSet<>(mc);
		set1.addAll(list);
		Iterator<Integer > iter = set1.iterator();
		// �Էµ� ������� �������� Ȯ��
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
			
		}
	}
	public static void test1(){	
		/*
		 * 	set1 	= 	{2,3,4,5,6,8,9,10}
		 * 	set2 	= 	{1,3,5,7,9}	
		 * 	������ 	: 	set1 =addAlrr = {1,2,3,4,5,6,7,8,9,10}
		 * 	������ 	:	set1.retainAll(set2) = {3,5,9}
		 * 	������ 	= 	set1-set2 : set1.removeAll(set2) => {2,4,6,8,10}
		 * 				set2-set1 : set2.removeAll(set1) => {1,7}	
		 */

		/*	���׸� Ŭ���� ��ü�� ������ �� Ÿ�� �Ķ���ʹ�
			������Ƽ�� Ÿ���� �� �� ����. ��ü Ÿ�Ը� �� �� �ִ�.
			LinkedHashSet�� �Է� ������� �����
			TreeSet�� ���� ���� ���ĵ� ������ �����.
		*/
		
		
		Set<Integer> set1 = new HashSet<>();
		/*	HashSet, LinkedHashSet, TreeSet
		 	Integer[] arr = {2,3,4,5,6,7,8,9,10};
		*/
		
		
		// �迭�� collection ��ü�� ����� �ִ� �޼ҵ尡 �ִ�
//		<Object>List<Object> java.util.ArrayLs.asLis
		List <Integer> list = Arrays.asList(2,3,4,5,6,8,9,10);
//		List <Integer> list = Arrays.asList(10,9,8,6,5,4,3,2);
		set1.addAll(list);
		
		
		// {1,3,5,7,9}
		Set<Integer> set2 = new HashSet<>();
//		List list2 = Arrays.asList(1,3,5,7,9);
		List<Integer> list2 = Arrays.asList(1,3,5,7,9);
		set2.addAll(list2);
		System.out.println("set1 : "+set1);
		System.out.println("set2 : "+set2);
		
		Set<Integer> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		System.out.println("set1 ������ set2 : "+set1);
		
		
		//		������
		Set<Integer> intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);
		System.out.println("set1 ������ set2 : "+ set1);
	
//		������
		Set<Integer> diffSet = new HashSet<>(set1);
		diffSet.removeAll(set2);
		System.out.println("set1 ������ set2 : " +diffSet);
		
//		for(int i = 0; i<diffSet.size();i++) {	
//			diffSet.get(i)
//		}
		System.out.println("#################");
//		for (Integer val : diffSet) {
//			// val ���� ������ ó������
//			System.out.println(val);
//		}
		
		Iterator <Integer> iter = diffSet.iterator();
		while(iter.hasNext()) {
			Integer val = iter.next();
			// val ������ ó��
			System.out.println(val);
		}
		
		System.out.println("#################");
		
		Set<Integer> diffSet2 = new HashSet<>(set2);
		diffSet.removeAll(set1);
		//{1,7}
		System.out.println("set2 ������ set1 : " + diffSet2);
		
	}
	

}

class MyComparator implements Comparator <Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		// TODO Auto-generated method stub
		// ���� ���ڷ� ���� �� ���� ũ�� ���
		// ������ 0
		// �ڿ� ���ڷ� ���޵� ���� ũ�� ����
		return n1 - n2 ; // << �̰��� �������� ������ ��
//		return n2 - n1 ; // << �̰��� �������� ������ ��
	}


	
}


