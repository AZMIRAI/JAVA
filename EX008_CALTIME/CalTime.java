package EX008_CALTIME;

public class CalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double lightSpeed		=	30e4;
		double	proximaCentauri		=	40e12;
		double	secs;
		
		double	time				=	(proximaCentauri/lightSpeed)/(60.0*60.0*24.0*365.0);
	
		secs	=	proximaCentauri/lightSpeed;
		
		double light_year	=	secs/(60.0*60.0*24.0*365.0);
		System.out.println("�ɸ��� �ð��� "+ light_year +"�����Դϴ�.");
		System.out.println("�ɸ��� �ð��� "+ time +"�����Դϴ�.");
		
	}

}
