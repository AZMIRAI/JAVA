package EX014_BITOPERATOR;

public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	x	=	0x0fff;
		int	y	=	0xfff0;
		
		System.out.printf("%x",(x&y));
		System.out.printf("%x",(x|y));
		System.out.printf("%x",(x^y));
		System.out.printf("%x",~x);
		System.out.printf("%x",(x<<y));
		System.out.printf("%x",(x>>y));
		System.out.printf("%x",(-1>>>4));
	}

}