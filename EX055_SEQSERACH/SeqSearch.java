package EX055_SEQSERACH;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	s[]			=	{10,20,30,40,50,60,70,80,90,100};
		int value,index	=	-1;
			
		Scanner scan	=	new Scanner (System.in);
		System.out.print("Ž�� �� ���� �Է��Ͻÿ� : ");
		value			=	scan.nextInt();
		
		for (int i=0;i<s.length;i++) {
			if(s[i]==value)
			{
				index 	=	i;
			}
			
		}
		if(index<s.length&&index >=0) {
			System.out.println(""+value+"����"+index +"��ġ�� �ֽ��ϴ�.");
		}
		
		scan.close();
	}

}