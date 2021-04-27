package EX039_GCD;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		
		
		int x	=	scan.nextInt();
		int	y	=	scan.nextInt();
		final int xx	=	x;
		final int yy	=	y;
//		int mem	=	0;
		int r	=	0;
		int yyy	=	0;
		
//		if(x<y) {
//			mem	=	y;
//			y	=	x;
//			x	=	mem;
//		}
		
		
		while (y!=0) {
			r	=	x%y;
			x	=	y;
			y	=	r;		
			
		}
		yyy	=	(xx*yy)/x;
		System.out.println(x);
		System.out.println(yyy);
		
		scan.close();
	}

}
