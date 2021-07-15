//Generic class
//Type parameter

public class GenericBox <T> {
//	다이아몬드 <T> 제너럴 클래스로 만듬
//	관례상 T로 만듬
	private T content;
	
	public T getContent() {
		
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}
