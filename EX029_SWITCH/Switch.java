package EX029_SWITCH;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan	=	new Scanner(System.in);
		
	
			
			int	a	=	scan.nextInt();
	
		switch(a) {
		case 0:
			System.out.println("바보");
			break;
		case 1:
			System.out.println("바보");
			break;
		case 2:
			System.out.println("치킨");
			break;
		case 3:
			System.out.println("크소");
			break;
		default : 
				System.out.println("오마에와 신데이루");
				scan.close();

		}
	}
	}

