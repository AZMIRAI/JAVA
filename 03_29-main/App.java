package App;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		System.out.println("��¥�� �Է��ϼ�");
		int date = scan.nextInt();
		
		 
		// ���� �����Ҷ� Ȯ���ϰ����Ҷ� ����
		assert (date >=1 && date <= 31) : "�߸��� ��¥ : "+date;
		
		System.out.printf("�Էµ� ��¥�� %d �Դϴ�.\n",date);
	
	}

}
