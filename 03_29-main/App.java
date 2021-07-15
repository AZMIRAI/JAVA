package App;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		System.out.println("날짜를 입력하셈");
		int date = scan.nextInt();
		
		 
		// 보통 개발할때 확인하고자할때 넣음
		assert (date >=1 && date <= 31) : "잘못된 날짜 : "+date;
		
		System.out.printf("입력된 날짜는 %d 입니다.\n",date);
	
	}

}
