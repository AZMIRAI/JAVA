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
		
		// Collection의 sort 메서드는 List 타입을 인자로 가진다
		// 인자로가진다
		System.out.println("*정렬전*");
		System.out.println(list+"\n");
		
		
		/* 
		기본 오름 차순 변경
		 Collections.reverse(list);
		 원소의 타입 클래스를 내가 변경 할 수 있으면
		 comparable 인터페이스를 구현해서 정렬 방법을 변경 할 수 있다
		 원소의 타입 클래스를 내가 변경 할 수 없으면(예를들어 string integers)
		 comparater 클래스를 구현해서 정렬 방법을 알려줘야한다
		 또는 원소의 타입 클래스를 변경 할 수 있지만, 그 클래스를 변경 하지않고
		 정렬 방법을 변경하고자 할 떄도 comparator 클래스를 구현해 준다
		*/
		
		//Collections.sort(list,new String 원소의 새로운 정렬방법); 
		Collections.sort(list,new MyStringComparator());
		// 기본 오름차순정렬

		
		System.out.println("*정렬후*");
		System.out.println(list+"\n");
		
//		int sum =CollectionsAPITest.add(3,4);
//		System.out.println("3 + 4 = "+sum); ;
	
	}	
	
	// add가 진짜 하는일
	public static int add(int n1, int n2) {
	return n1+n2;
} }