package EX028_WELCOME;

import java.util.*;

public class Welcome {

	public static void main(String[] args) {
		
		
		Date d		=	new Date();
		
		@SuppressWarnings("deprecation")
		int currentHour		=	d.getHours();
		@SuppressWarnings("deprecation")
		int currentMonth	=	d.getMonth();
		
		
		
		System.out.println("����ð��� "+ d);
		
		if(12>currentHour && currentHour>=6) {
		System.out.println("��ħ�Դϴ� ~ ");}
		
		else if(18>currentHour && currentHour>=12) {
			System.out.println("�����Դϴ� ~ ");}
			
		else  {
			System.out.println("�����Դϴ� ~ ");}
		
		
		
		
		if(6>currentMonth && currentMonth>=3) {
			System.out.println("���Դϴ�");}
			
			else if(9>currentMonth && currentMonth>=6) {
				System.out.println("�����Դϴ�");}
			else if(11>currentMonth && currentMonth>=9) {
				System.out.println("�����Դϴ� ~ ");}
			else  {
				System.out.println("�ܿ��Դϴ� ~ ");}
		
		
	
		
	}

}
