package EX057_LOTTO;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Lotto	=	45;
		Random ran	=	new Random();
		int index	=	0;
		int s[]		=	{0,0,0,0,0,0,0};
		
		for (int i=0;i<7;i++) {
			
			index	=	ran.nextInt(Lotto);
			
			for(int j=0;j<7;++j) {
				
			if(index==s[j])
				
				continue;else {}
				
			}
			
			s[i]	=	index;
			System.out.println(s[i]);
		}
		
	}

}
