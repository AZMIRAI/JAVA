package EX026_BONUS;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		final	int	targetScale	=	1000;
		int	sale	;
		int bonus	;
		System.out.print("������ �Է��ϼ���.. : ");
		sale		=	scan.nextInt();
		if(sale>targetScale) {
			
			bonus	=	(sale-targetScale)/10;
			System.out.print("���ʽ� : "+bonus);
		}else
		{
		System.out.println("���ʽ��� ��ǥ���� ���� ���߽��ϴ�..");
		}
		
		scan.close();
	}

}
