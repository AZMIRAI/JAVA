package FileError2;

public class MyResource implements AutoCloseable{ //close
	public MyResource(){
		System.out.println("MyResource ����");
	}
	
	public int getValue() throws OutOfResourcesException {
		int random = (int)(Math.random()*2);
				if (random ==0) {
					throw new OutOfResourcesException("�ڿ� �� ����");
				}
		return (int)(Math.random()*100);
	}
	
	public void close() {
		System.out.println("close �ڿ� �ݳ�");
	}
}
