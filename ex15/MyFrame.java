package ex15;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	
	JPanel a	;
	
	public MyFrame(){
		
		this.setSize(300,200);
		this.setTitle("¿Ã∏ß");
		a	=	new JPanel();
		a.setLayout(new GridLayout());
		for (int i=0;i<10;i++) {
			a.add(new JButton("Button"+i));
		}
		this.add(a);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyFrame MF	=	new MyFrame();
	}

}
