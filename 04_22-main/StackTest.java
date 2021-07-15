package Stack;

import java.util.*;

public class StackTest {

	public static void main (String []args) {	 
/*		
		 (스택 넣고
		 ) 만나면 pop 해서 스택에서 빼고
		 주어진 식을 다 처리했을 때, 스택이 empty가 된다.
		 만약에 empty가 아니면 잘못된 식이다.
		 ( ( ( ) )  << 잘못된 식 >> 처리 후에 스택이 empty가 아니게된다
		 ( ) ) >> pop했을때 인출되는 원소가 있어야되는데, 없는 경우 이고.
		 이 경우도 잘못된 식이다.
		 
		 2 * ( 3 + 2 ) / ( 3 + 1 ) / 2 * 5 - 1 + 10  	
*/		
		
//		 1. 먼저 수식을 입력 받자.    	
		Scanner scan = new Scanner(System.in); 
//		 콘솔 입력을 위한 Scanner 객체 생성
		System.out.println("수식을 입력하세요.");
		String exp = scan.nextLine();
		
		
//		 2. 입력받은 수식을 공백을 기준으로 문자열 토큰으로 분리하자.
//	        exp 문자열 변수에 값을 공백을 기준으로 문자열 토큰들로 분리.
		StringTokenizer st = new StringTokenizer(exp);
		
		
//		 3. 토큰을 하나씩 뜯어보면서 여는 괄호이면 스택에 push, 닫는괄호이면 스택에서 pop
		Stack<String> stack = new Stack<>();
	
		while(st.hasMoreTokens()) { 
//		 아직 줄 토큰이 남았는가 st.hasMoreElements()
			String token = st.nextToken();
//		 token이 여는 괄호이면 stack에 push
			if (token.equals("(")) stack.push(")");
//		 token이 닫는 괄호이면 stack에서 pop()
			else if (token.equals(")")) {
/*			     근데 stack에 원소가 하나도 없다면...
				 이거는 닫는 괄호에 매칭되는 여는 괄호가 없다는 의미
				 이거는 잘못된식 더 이상 다른 토큰을 볼 필요도없음
*/
				if (stack.isEmpty()) {
					System.out.println("잘못된 식입니다..");
					return;
				}
				stack.pop();
			}
		}
/*		 흐흠이 여기까지 왔다는것은
		 식에 잘못된 것이 없거나, 여는 괄호가 더 많은 경우.
		 모든 토큰 처리가 끝났고, 그 때까지 잘못된 괄호가 발견 되지 않았다.
*/
		if (stack.isEmpty() != true) {
			System.out.println("잘못된 식입니다...");
			return;
		}
		
		System.out.println("유효한 식입니다...");
		
/*		후위표기법 (Postfix)
		
		3+4  34+
		3+4*2  342*+
		중위표기법(Infix)을 후위표기법으로 변환할 수 있음 : stack을 사용하면.

		Map 
		맵은 많은 데이터중 원하는 데이터를 빠르게 찾을 수 있는 자료 구조 이다
		맵은 사진과 같은 자료 구조이다
		HashMap
		TreeMap
		LinkedHashMap
*/	
	}
}
