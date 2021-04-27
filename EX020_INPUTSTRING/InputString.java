package EX020_INPUTSTRING;

import java.util.*;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int	age;
		
		Scanner scan	=	new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name	=	scan.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age		=	scan.nextInt();
		
		System.out.println(name	+	"님 안녕하세요! "+age+"살이시네요.");
		
		scan.close();
	}

}
