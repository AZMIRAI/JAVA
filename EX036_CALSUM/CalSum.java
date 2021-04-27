package EX036_CALSUM;

public class CalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count	=	0;
		int	sum		=	0;
		while (count<10) {
			sum		=	sum+(++count);
		}
	System.out.println(sum);
	}
}
