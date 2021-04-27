package EX043_DIVISOR;

import java.util.Scanner;

public class Divisor {
	
	public static void main (String[]args) {
		
		Scanner scan	=	new Scanner(System.in); 
			
		System.out.print("양의 정수를 입력하세요... : ");
		
		int insert		=	scan.nextInt();
		
		for (int i=1;i<=insert;i++) {
			
			if (insert%i==0) {
				System.out.print(i+" ");
				
			}
			
		}
		
		scan.close();
		
	}
}
