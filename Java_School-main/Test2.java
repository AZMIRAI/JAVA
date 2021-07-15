import java.util.ArrayList;

public class Test2 {
	public static void main (String []args) {
		
		String [] arr1 =  {"치킨","피자"};
		
//		배열의 불편한점
//		선언할때 크기가 정해져있음
		
		
		ArrayList<String> strList = new ArrayList<>();
		
		for (int i = 0; i<1000;i++) {
			strList.add(String.valueOf(i));
			strList.add("" +i);
			// 위 2개 똑같은것
			
			
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
