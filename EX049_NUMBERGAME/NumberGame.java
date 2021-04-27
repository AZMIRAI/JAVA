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
			
			System.out.print("정답을 추측하여 보시오 : ");
			int insert		=	scan.nextInt();
			count++;	
			if (insert>nai) {
				
				System.out.println("제시한 정수가 큽니다");
			}
			else if (insert<nai) {
				System.out.println("제시한 정수가 작습니다");
				
			}
			else {
				
				break;
			}
		}
		System.out.println("축하합니다. 시도횟수 = "+count);
		
		scan.close();
	}

}
