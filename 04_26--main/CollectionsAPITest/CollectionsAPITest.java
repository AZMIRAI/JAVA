package CollectionsAPITest;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class  CollectionsAPITest {

	private String name;
	
	public CollectionsAPITest (String name) {
		this.name = name;
	}
	
	// static or instance method
	public String getName () {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] sample = {"i","walk","the","line"};
		List<String> list = Arrays.asList(sample); 
		
		// Collection�� sort �޼���� List Ÿ���� ���ڷ� ������
		// ���ڷΰ�����
		System.out.println("*������*");
		System.out.println(list+"\n");
		
		
		/* 
		�⺻ ���� ���� ����
		 Collections.reverse(list);
		 ������ Ÿ�� Ŭ������ ���� ���� �� �� ������
		 comparable �������̽��� �����ؼ� ���� ����� ���� �� �� �ִ�
		 ������ Ÿ�� Ŭ������ ���� ���� �� �� ������(������� string integers)
		 comparater Ŭ������ �����ؼ� ���� ����� �˷�����Ѵ�
		 �Ǵ� ������ Ÿ�� Ŭ������ ���� �� �� ������, �� Ŭ������ ���� �����ʰ�
		 ���� ����� �����ϰ��� �� ���� comparator Ŭ������ ������ �ش�
		*/
		
		//Collections.sort(list,new String ������ ���ο� ���Ĺ��); 
		Collections.sort(list,new MyStringComparator());
		// �⺻ ������������

		
		System.out.println("*������*");
		System.out.println(list+"\n");
		
//		int sum =CollectionsAPITest.add(3,4);
//		System.out.println("3 + 4 = "+sum); ;
	
	}	
	
	// add�� ��¥ �ϴ���
	public static int add(int n1, int n2) {
	return n1+n2;
} }