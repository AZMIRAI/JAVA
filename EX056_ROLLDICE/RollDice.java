package EX056_ROLLDICE;

import java.util.Random;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random 	ran	=	new Random();
		int s[]	=	new int [6];
		
		for (int i=0;i<10000;i++) {
			
			int a	=	ran.nextInt(6);
			
			switch (a) {
			case 0	: s[0] = s[0]+1;
			break;
			case 1	: s[1] = s[1]+1;
			break;
			case 2	: s[2] = s[2]+1;
			break;
			case 3	: s[3] = s[3]+1;
			break;
			case 4	: s[4] = s[4]+1;
			break;
			case 5	: s[5] = s[5]+1;
			break;
			}
			
			
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(s[i]);
			
		}
	}

}
