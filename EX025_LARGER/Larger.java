package EX025_LARGER;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int	a	=	scan.nextInt();
		System.out.print("�ι�° ���� : ");
		int	b	=	scan.nextInt();
		
		if(a>b) {
			System.out.println("ū ���� "+a);
		}else if(a==b) {
			System.out.println("�� ���� �Ȱ����ϴ�.");
		}else {
			System.out.println("ū ���� "+b);
		}
		scan.close();
	}

}
