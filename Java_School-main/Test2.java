import java.util.ArrayList;

public class Test2 {
	public static void main (String []args) {
		
		String [] arr1 =  {"ġŲ","����"};
		
//		�迭�� ��������
//		�����Ҷ� ũ�Ⱑ ����������
		
		
		ArrayList<String> strList = new ArrayList<>();
		
		for (int i = 0; i<1000;i++) {
			strList.add(String.valueOf(i));
			strList.add("" +i);
			// �� 2�� �Ȱ�����
			
			
		}
		
		for (int i=0;i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	
		ArrayList<Student> stdList = new ArrayList<>();
		for (int i=0;i<100;i++) {
			stdList.add(new Student());
		}
	
	}
}
