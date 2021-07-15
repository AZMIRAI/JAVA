
public class GenericTest {
	public static void main(String []args) {
		
		GenericBox box = new GenericBox<String>();
		
		 
//		GenericBox box = new GenericBox<>();
//		뒷부분 타입 안써도 관계없음
		
//		box.setContent("동해물과");
		
//		String s = box.getContent();
//		System.out.println(s);
		
		GenericBox<Integer> box2= new GenericBox<Integer>();
		
		box2.setContent(100);
		
		GenericBox<Student> box3 = new GenericBox<Student>();
		
		box3.setContent(new Student());
		Student std = box3.getContent();
		
		
	}
}
