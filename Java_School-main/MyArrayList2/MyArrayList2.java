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
		
		list.add(3,100); // 3자리에 100을 추가하지만 뒤에거는 밀려남
		System.out.println(list);
//		list.remove(3); //3자리를 삭제해도 구멍이 나지않음 한자리 앞으로 밀림
		list.remove(Integer.valueOf(100)); //똑같음 위에거랑
		System.out.println(list);
	}
}
