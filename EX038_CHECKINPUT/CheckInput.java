package EX038_CHECKINPUT;

import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		int		month	=	0;
		int		check	=	0;
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ�... : ");
			month		=	scan.nextInt();
			if(month>0&&month<=12) {
				check	=	1;
			}else {
				System.out.println("�ٽ� �Է��ϼ���..");
			}
			
		}while(check==0);//�̰� ��� 0�̸� �ݺ�.. �װ� �ƴϸ� Ż��..
		System.out.println("����ڰ� �Է��� ���� " + month);
		
		scan.close();
	}

}
