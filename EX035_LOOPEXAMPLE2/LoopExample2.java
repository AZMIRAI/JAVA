package EX035_LOOPEXAMPLE2;

import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		int N	;
		System.out.print("구구단 중에서 출력 하고싶은 단을 입력하세요 : ");
		N		=	scan.nextInt();
		int i	=	0;
		int re	=	1;
		while(9>i) {
			
			
			System.out.println(N+"*"+re+" = "+N*re);
			
			re++;
			i++;
			
		}
	scan.close();
	}

}
