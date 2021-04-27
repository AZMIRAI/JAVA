package EX047_CONTINUETEST;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s	=	"no news is good news";
		int n		=	0;
		
		for (int i=0;i<s.length();i++) {
			// n이 나오는 횟수를 센다.
			
			if(s.charAt(i)!='n') {
				continue;
			}
			
		n++;	
		}
		
		System.out.println("문장에서 발견된 n의 갯수 " + n);
		
	}	

}
