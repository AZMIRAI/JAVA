package EX052_ARRAYTEST2;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		final int	personNumber	=	5;
		int []	s	=	new int [personNumber];
		int average	=	0;
		for (int i=0;i<s.length;i++) {
			System.out.print("������ �Է��ϼ��� : ");
			s[i]	=	scan.nextInt();
			average	=	average	+	s[i];
		}
		average		=	average/personNumber;
		
		System.out.print("��� ������ " +average+"�Դϴ�" );
		
		scan.close();
	}

}
