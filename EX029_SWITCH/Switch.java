package EX029_SWITCH;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan	=	new Scanner(System.in);
		
	
			
			int	a	=	scan.nextInt();
	
		switch(a) {
		case 0:
			System.out.println("�ٺ�");
			break;
		case 1:
			System.out.println("�ٺ�");
			break;
		case 2:
			System.out.println("ġŲ");
			break;
		case 3:
			System.out.println("ũ��");
			break;
		default : 
				System.out.println("�������� �ŵ��̷�");
				scan.close();

		}
	}
	}

