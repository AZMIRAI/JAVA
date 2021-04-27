package EX038_CHECKINPUT;

import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		int		month	=	0;
		int		check	=	0;
		do {
			System.out.print("올바른 월을 입력하시오... : ");
			month		=	scan.nextInt();
			if(month>0&&month<=12) {
				check	=	1;
			}else {
				System.out.println("다시 입력하세요..");
			}
			
		}while(check==0);//이게 계속 0이면 반복.. 그게 아니면 탈출..
		System.out.println("사용자가 입력한 월은 " + month);
		
		scan.close();
	}

}
