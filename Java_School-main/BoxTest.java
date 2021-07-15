
public class BoxTest {
	public static void main(String [] args) {
		
//		Box box 	=	new Box();
//		
//		box.setContent("동해물과백두산이");
//		
//		String cont = box.getContent();
//
//				System.out.println(cont);
//				
//				Box2 box2 = new Box2();
//				box2.setContent(100);
//				Integer cont2 = box2.getContent();
//				System.out.println(cont2);
//				
//		Box3 box3 = new Box3();
//		Student std = new Student();
//		std.setName("홍길동");
//		std.setDept("컴정");
//		std.setGrade(100);
//		
//		box3.setContent(std);
//		std = box3.getContent();
//		
//		System.out.println(std.getName()+":"+std.getGrade());
		
		
	
//		Box box = new Box();
//		box.setContent(new Student());
//		box.setContent(100);
		
		Box4 box = new Box4();
//		box.setContent(new Student());
//		box.setContent(100);
		box.setContent("마르고 닳도록");
		process(box);
		
		
		
	}
	public static void process(Box4 box) {
		//...
		Object obj = box.getContent();
		
		if(obj instanceof Student) {
			
			Student std = (Student)obj;
			
			String s=std.getName();
			int n = std.getGrade();
			
			// db 테이블에저장
		} else if (obj instanceof String) {
			// 문자열처리
		} else if (obj instanceof Integer) {
			// 정수 처리
		}
				
//		Student std = (Student)obj;
//		String s = std.getName();
//		int n = std.getGrade();
		
		
	}
}
