package FileError2;

public class OutOfResourcesException extends Exception{
	public OutOfResourcesException() {
		System.out.println("OutOfResourcesException 梓端持失");
	}
	public OutOfResourcesException(String msg) {
		super(msg);
		System.out.println("OutOfResourcesException 梓端持失");
	}
}
