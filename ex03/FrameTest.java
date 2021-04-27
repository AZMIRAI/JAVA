package ex03;

import javax.swing.JFrame;

public class FrameTest extends JFrame{

	public FrameTest() {
		
		this.setTitle("DODO");
		this.setSize(1280,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameTest f	=	new FrameTest();
		
	}

}
