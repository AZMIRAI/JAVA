package EX044_RANDOMNUMBER;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random R		=	new Random();
		Scanner	scan	=	new Scanner(System.in);
		
		System.out.print("������ ���� : ");
		int recycle		=	scan.nextInt();
		int sum			=	0;
		for (int i=0;i<recycle;i++) {
			int number		=	R.nextInt(100);		
				
			sum	=	sum+number;
			System.out.print(number);
			
		}
		System.out.println("���� "+recycle+"���� ���� "+sum);
		
		scan.close();
	}

}
