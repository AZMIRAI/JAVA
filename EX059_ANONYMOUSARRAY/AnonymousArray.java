package EX059_ANONYMOUSARRAY;

public class AnonymousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڵ��� �� : "
		+sum(new int[] {1,2,3,4}));
	}	
	public static int sum(int[] numbers)
	{
		int total	=	0;
		for (int i=0;i<numbers.length;i++) {
			total	=	total+numbers[i];
		}
		return total;
}
}