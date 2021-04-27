package EX046_AVERAGER;

import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total	=	0;
		int	count	=	0;
		Scanner scan	=	new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int grade	=	scan.nextInt();
			if(grade<0) {
				break;
			}
		total += grade;
		count++;
		}
		System.out.println("평균은 "+total/count);
	scan.close();
	}

}
