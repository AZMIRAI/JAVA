package EX026_BONUS;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		final	int	targetScale	=	1000;
		int	sale	;
		int bonus	;
		System.out.print("실적을 입력하세요.. : ");
		sale		=	scan.nextInt();
		if(sale>targetScale) {
			
			bonus	=	(sale-targetScale)/10;
			System.out.print("보너스 : "+bonus);
		}else
		{
		System.out.println("보너스를 목표까지 하지 못했습니다..");
		}
		
		scan.close();
	}

}
