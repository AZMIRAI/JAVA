package EX054_GETMIN;

public class GetMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]	=	{12,3,19,6,18,8,12,4,1,19};
		int minimumValue		=	s[0];
		int maximumValue		=	s[0];
		
		for(int i=0;i<s.length;i++) {
			
			if(s[i]<minimumValue){
			minimumValue	=	s[i];
			}
			if(s[i]>maximumValue) {
			maximumValue	=	s[i];
			}
		}
		
	
		
		System.out.println("�ּҰ��� "+minimumValue+"�Դϴ�");
		System.out.println("�ִ밪�� "+maximumValue+"�Դϴ�");
	}
	
}
