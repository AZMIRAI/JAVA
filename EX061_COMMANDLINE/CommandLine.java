package EX061_COMMANDLINE;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length>0) {
			for (int i=0;i<args.length;i++) 
				System.out.print(" "+args[i]);
			
		if (args[0].equals("-h"))
			System.out.print("HELP ");
			
				
				
				
				
			
		}
	}

	}
