package EX027_GRADING;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		int	grad	=	0;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		grad	=	scan.nextInt();
		
		if(grad>100) {
			System.out.println("���� ���� ����ϴ�..");
		}else if(100>=grad&&grad>=90) {
			System.out.println("���� A");
		}else if(89>=grad&&grad>=80) {
			System.out.println("���� B");
		}else if(79>=grad&&grad>=70) {
			System.out.println("���� C");
		}else if(69>=grad&&grad>=60) {
			System.out.println("���� D");
		} else {
			System.out.println("���� F.. �����Դϴ�..");
		}
		scan.close();
	}

}
