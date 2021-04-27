package EX058_THEATERRESERVE;

import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		int	 	count 	=	0;
		int 	flag	=	0;
		int a[]		=	new int[10];
		System.out.println("----------------------");
		System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
		System.out.println("----------------------");
		for (int i=0;i<20;i++)
		{
			if(i%2==1) {
				
				System.out.print(a[count]);
				count++;
				
			}else {
				System.out.print(" ");
			}
		
		}
		count	=	0;
		while (flag==0) {
			
			
			System.out.println(" ");
		System.out.print("원하시는 좌석번호를 입력하세요 : ");
		int scanner	=	scan.nextInt()-1;
		if(scanner==-2) {
			System.out.println("종료합니다.");
			break;
		}
		if(a[scanner]!=0) {
			System.out.println("이미 예약된 자리입니다.");
			continue;
		}
		else {
			
			a[scanner]	=	1;
			System.out.println("----------------------");
			System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
			System.out.println("----------------------");
		
			for (int i=0;i<20;i++)
			{
				if(i%2==1) {
					
					System.out.print(a[count]);
					count++;
					
				}else {
					System.out.print(" ");
				}
			
			}count	=	0;
		}
		scan.close();
		}
		
}
}
