package ex16;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

	JPanel a	;
	
	public MyFrame(){
		this.setTitle("ġŲ");
		this.setSize("1000,2000");
		a	=	new JPanel();
		for (int i=0;i<10;i++) {
			a.add(new JButton ("��ȣ"+i));
			
		}
		this.add(a);
		this.setVision();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
