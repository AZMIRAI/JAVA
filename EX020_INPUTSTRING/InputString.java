package EX020_INPUTSTRING;

import java.util.*;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int	age;
		
		Scanner scan	=	new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		name	=	scan.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		age		=	scan.nextInt();
		
		System.out.println(name	+	"�� �ȳ��ϼ���! "+age+"���̽ó׿�.");
		
		scan.close();
	}

}
