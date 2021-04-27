package EX009_CALTIME1;

public class CalTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double	v		=	60e3;
		double			l		=	40e12;
		double			a		=	l/v;
		double			time	=	a/(60.0*60.0*24.0*365.0);
		System.out.println("보이저 호로 프록시마 센타우리 까지는 "+time+"광년입니다.");
	
	}

}
