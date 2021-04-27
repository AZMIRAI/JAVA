package EX025_LARGER;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int	a	=	scan.nextInt();
		System.out.print("두번째 정수 : ");
		int	b	=	scan.nextInt();
		
		if(a>b) {
			System.out.println("큰 수는 "+a);
		}else if(a==b) {
			System.out.println("두 수는 똑같습니다.");
		}else {
			System.out.println("큰 수는 "+b);
		}
		scan.close();
	}

}
