//Generic class
//Type parameter

public class GenericBox <T> {
//	���̾Ƹ�� <T> ���ʷ� Ŭ������ ����
//	���ʻ� T�� ����
	private T content;
	
	public T getContent() {
		
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}
