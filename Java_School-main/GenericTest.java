
public class GenericTest {
	public static void main(String []args) {
		
		GenericBox box = new GenericBox<String>();
		
		 
//		GenericBox box = new GenericBox<>();
//		�޺κ� Ÿ�� �Ƚᵵ �������
		
//		box.setContent("���ع���");
		
//		String s = box.getContent();
//		System.out.println(s);
		
		GenericBox<Integer> box2= new GenericBox<Integer>();
		
		box2.setContent(100);
		
		GenericBox<Student> box3 = new GenericBox<Student>();
		
		box3.setContent(new Student());
		Student std = box3.getContent();
		
		
	}
}
