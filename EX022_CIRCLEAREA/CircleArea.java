package EX022_CIRCLEAREA;

import java.util.*;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		double		a	;	//반지름
		double		b	;	//값
		final	double	radius	=	3.14159;
		
		System.out.print("반지름을 입력하세요 : ");
		a	=	scan.nextDouble();
		b	=	a*a*radius;
		System.out.printf("%2.1f",b);
		scan.close();
		
	}

}
