package EX023_BOX;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan	=	new Scanner(System.in);
		
		double	w,h,area,perimeter;
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
		w	=	scan.nextDouble();
		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
		h	=	scan.nextDouble();
		area	=	w*h;
		perimeter	=	2*(w+h);
		
		System.out.println("�簢���� ���̴� : "+ area);
		System.out.println("�簢���� �ѷ��� : "+ perimeter);
		
		scan.close();
	}

}
