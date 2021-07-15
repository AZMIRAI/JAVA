package CollectionsAPITest;
import java.util.*;
public class CollectionsAPITest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shuffleTest();
		// 이진탐색은 정렬된 리스트에서
		// 내가원하는 값을 찾아주는방법
		binarySearchTest();
	}
	
	public static void binarySearchTest() {
		// 1. 무작위 정수를 저장한 리스트에 대해 이진탐색 <= 잘못된 결과가 나오는 경우
		// 2. 정렬된 리스트에 대해 이진탐색 <= 이렇게 사용해야함.
		
		Random random = new Random();
		List <Integer> list = new ArrayList<>();
		for (int i=0; i<20; i++) {
			list.add(random.nextInt(100)+1);
		}
		Collections.sort(list);
		// 정렬이 되어있어야지 가능
		System.out.println(list);
		
		int idx = Collections.binarySearch(list, 32);
		if(idx>=0) {
			System.out.println((idx+1) +"번째에 있습니다");
		}
		else {
			System.out.println(idx);
			System.out.println("찾고자하는 값은 리스트에 없습니다");
		}
	}
	
	
	
	
	public static void shuffleTest() {
		
		//	리스트 생성후 리스트에 값 붙히기	
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<10; i++) {
			list.add((i+1)*1);
		}
		
		//리스트2 생성후 리스트에 값 붙히기	
		ArrayList <Student> list2 = new ArrayList<>();
		for (int i=0;i<10;i++) {
			Student std = new Student();
			std.grade = (i+1)*100;
			list2.add(std);
		}
		
		//	섞기 전 리스트 출력
		System.out.println("섞기 전");
		System.out.println(list);
		System.out.println(list2);
		
		//	섞는 컬렉션
		Collections.shuffle(list);
		Collections.shuffle(list2);
		
		//	섞은 후 리스트 출력
		System.out.println("섞은 후");
		System.out.println(list);
		System.out.println(list2);
	}

}



