package EX027_GRADING;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		int	grad	=	0;
		
		System.out.print("성적을 입력하시오 : ");
		grad	=	scan.nextInt();
		
		if(grad>100) {
			System.out.println("범위 내에 벗어납니다..");
		}else if(100>=grad&&grad>=90) {
			System.out.println("학점 A");
		}else if(89>=grad&&grad>=80) {
			System.out.println("학점 B");
		}else if(79>=grad&&grad>=70) {
			System.out.println("학점 C");
		}else if(69>=grad&&grad>=60) {
			System.out.println("학점 D");
		} else {
			System.out.println("학점 F.. 과락입니다..");
		}
		scan.close();
	}

}
