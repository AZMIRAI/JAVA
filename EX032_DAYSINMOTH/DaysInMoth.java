package EX032_DAYSINMOTH;

import java.util.Scanner;

public class DaysInMoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		int days	=	0;
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��ϼ��� : ");
		Scanner scan	=	new Scanner(System.in);
		
		month	=	scan.nextInt();
		switch	(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				days	=	30;
				break;
			case 2:
				days	=	28;
				break;
			default:
				days	=	31;
				break;
		}
	scan.close();
	System.out.println("���� �� ���� "+days);
	
	}

}
