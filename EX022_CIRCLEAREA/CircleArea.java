package EX022_CIRCLEAREA;

import java.util.*;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		double		a	;	//������
		double		b	;	//��
		final	double	radius	=	3.14159;
		
		System.out.print("�������� �Է��ϼ��� : ");
		a	=	scan.nextDouble();
		b	=	a*a*radius;
		System.out.printf("%2.1f",b);
		scan.close();
		
	}

}
