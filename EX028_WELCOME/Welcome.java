package EX028_WELCOME;

import java.util.*;

public class Welcome {

	public static void main(String[] args) {
		
		
		Date d		=	new Date();
		
		@SuppressWarnings("deprecation")
		int currentHour		=	d.getHours();
		@SuppressWarnings("deprecation")
		int currentMonth	=	d.getMonth();
		
		
		
		System.out.println("현재시간은 "+ d);
		
		if(12>currentHour && currentHour>=6) {
		System.out.println("아침입니다 ~ ");}
		
		else if(18>currentHour && currentHour>=12) {
			System.out.println("점심입니다 ~ ");}
			
		else  {
			System.out.println("저녁입니다 ~ ");}
		
		
		
		
		if(6>currentMonth && currentMonth>=3) {
			System.out.println("봄입니다");}
			
			else if(9>currentMonth && currentMonth>=6) {
				System.out.println("여름입니다");}
			else if(11>currentMonth && currentMonth>=9) {
				System.out.println("가을입니다 ~ ");}
			else  {
				System.out.println("겨울입니다 ~ ");}
		
		
	
		
	}

}
