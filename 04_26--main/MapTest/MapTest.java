package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		
	}

	public static void test2() {
		/*
		 	친구들 전화번호를 저장하는 map 객체 생성함
		 	<이름, 전화번호> // "小栗旬", "090-1234-5678"
		 */
		String [] names = {"小栗旬","デヨン","未来","さとみ" };
		String [] phones = {"090-1234-0000","090-1234-1000","090-1234-2000","090-1234-3000"};
		Map<String,String> phoneBook	=	new HashMap<>();
		for (int i=0; i<names.length; i++) {
			phoneBook.put(names[i], phones[i]);
		}
		
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.print("\n友達の名前 : ");
			String name = input.nextLine();
			if(name.equals("")) break;
			String phone = phoneBook.get(name);
			System.out.println(name + "の電話番号は" + phone + "です");
		}
		System.out.println("プログラムを終了します");
	
	}
	
	public static void test1(){
		/*
		 	Map은 객체, HashMap 객체를 생성하자.
		 	맵은 <key,value>의 쌍으로 저장하고
		 	key값을 통해 값을 인출한다
		 	Map이라는 놈이 generic 인터페이스이고
		 	이글을 구현한 HashMap, TreeMap, LinkedHashMap 클래스들은
		 	제네릭 클래스 라는것
		 	이 의미는 저 객체들을 생성할때 타입을 지정 해줘야한다
		 */
	
		// ArrayList<Integer>	list	= new ArrayList<>();
		// ArrayList<String>	list2	= new ArrayList<>();
		// ArrayList<Student>	list3	= new ArrayList<>();
		
		// Map에 <학번, 학생객체> 이렇게 저장 할 예정 ~ 
		
		
		Map<String, Student> map = new HashMap<>();
		
//		map = new TreeMap<>();
		
		map.put("2000101", new Student(2000101, "ファンデヨン"));
		map.put("2000102", new Student(2000102, "未来"));
		map.put("2000103", new Student(2000103, "旬"));
		map.put("2000104", new Student(2000104, "さとみ"));
		map.put("2000105", new Student(2000105, "健太郎"));
		
		Student value = map.get("2000103");
		System.out.println(value.getName());
		map.put("2000103", new Student(2000103, "誰やろ！"));
		value = map.get("2000103");
		System.out.println(value.getName()+"\n");
		
		
		/*
		 	Map이라는 자료구조에 들어 가 있는 모든 원소들을 다 읽을 수 있는 방법은
		 	1.	Map에게 니가 가진 원소의 모든 키 집합을 요청 하고
		 		그 집합의 각 원소를 가지고 Map에게 값을 요청 하는법
		 	2.	Map에게 <Key,Value> 쌍으로 저장된 엔트리 집합을 요청해서
		 		그 집합의 원소를 하나씩 읽는 방법.
		 */
		
		Set<String> keyset = map.keySet();
//		 Set의 원소를 하나씩 접근하는 방법은 뭔가요?
//		 Set<원소타입>
		Iterator<String> iter = keyset.iterator();
		
		while(iter.hasNext()) {
			String key	= iter.next();
			Student val	= map.get(key);
			System.out.println("キー値 ： " + key + ", 変数 ： " + val.toString());
			
		}
		System.out.println("");
		// map 에서 엔트리라 함은 <key, value>의 쌍으로 구성된 객체.
		// 객체라고함은 이 객체를 정의하는 클래스가 있다는 의미
		
		Set<Entry<String, Student>> entryset = map.entrySet();
		Iterator<Entry<String, Student>> eIter = entryset.iterator();
		while(eIter.hasNext()) {
			Entry<String, Student> entryObj = eIter.next();
			String key = entryObj.getKey();
			Student val = entryObj.getValue();
			System.out.println("キー値 ： " + key + ", 変数 ： " + val.toString());			
		}
		
		
	}	
}


class Student {
	private int hakbun;
	private String name;
	
	@Override
	public String toString() {
		return "[ 学番 ： " +hakbun+" お名前 ： "+name+" ]";
	}
	
	public Student(int hakbun, String name) {
		super();
		this.hakbun = hakbun;
		this.name = name;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


	
}