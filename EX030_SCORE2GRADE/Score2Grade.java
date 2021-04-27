package EX030_SCORE2GRADE;

import java.util.Scanner;

public class Score2Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		int		score;
		int		scoreEx;
		
		System.out.print("성적을 입력하세요 : ");
		score			=	scan.nextInt();
		scoreEx			=	score/10;
		
		switch (scoreEx){
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
		}
		
		
		scan.close();
	}

}
