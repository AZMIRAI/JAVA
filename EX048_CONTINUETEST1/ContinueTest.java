package EX048_CONTINUETEST1;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		System.out.print("������ �Է��ϼ���~ : ");
		String input	=	scan.nextLine();
		int n			=	0;
		
		for (int i=0;i<input.length();i++) {
			
			if(input.charAt(i)!='n') {
				
				continue;
			
			
			}
			
			n++;	
		}
		
		System.out.println(n);
		scan.close();
	}

}
