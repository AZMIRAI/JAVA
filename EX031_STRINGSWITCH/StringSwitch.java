package EX031_STRINGSWITCH;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	month	;
		Scanner scan	=	new Scanner(System.in);
		
		System.out.print("월의 이름을 입력하세요.. : ");
		month			=	scan.next();
			
		switch(month) {
			case "1월":
				System.out.println("1");
				break;
			case "2월":
				System.out.println("2");
				break;
			case "3월":
				System.out.println("3");
				break;
			case "4월":
				System.out.println("4");
				break;
			case "5월":
				System.out.println("5");
				break;
			case "6월":
				System.out.println("6");
				break;
			case "7월":
				System.out.println("7");
				break;
			case "8월":
				System.out.println("8");
				break;
			case "9월":
				System.out.println("9");
				break;
			case "10월":
				System.out.println("10");
				break;
			case "11월":
				System.out.println("11");
				break;
			case "12월":
				System.out.println("12");
				break;
		}
		scan.close();
	}

}
