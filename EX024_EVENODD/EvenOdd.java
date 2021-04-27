package EX024_EVENODD;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	number	;	
		Scanner scan	=	new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		number			=	scan.nextInt();
		
		if(number%2==0) {
			System.out.println("입력된 정수는 짝수입니다.");
			
		}else System.out.println("입력된 정수는 홀수입니다.");
		
		System.out.println("프로그램이 종료되었습니다.");
		
		scan.close();
	}

}
