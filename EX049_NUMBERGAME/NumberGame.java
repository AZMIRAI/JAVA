package EX049_NUMBERGAME;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran	=	new Random();
		Scanner scan	=	new Scanner(System.in);
		int count		=	0;
		int nai			=	ran.nextInt();
		while(true) {
			
			System.out.print("������ �����Ͽ� ���ÿ� : ");
			int insert		=	scan.nextInt();
			count++;	
			if (insert>nai) {
				
				System.out.println("������ ������ Ů�ϴ�");
			}
			else if (insert<nai) {
				System.out.println("������ ������ �۽��ϴ�");
				
			}
			else {
				
				break;
			}
		}
		System.out.println("�����մϴ�. �õ�Ƚ�� = "+count);
		
		scan.close();
	}

}
