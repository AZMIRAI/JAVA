package ex04;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex extends JFrame{

	public Ex() {
		
		this.setTitle("dd");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setLayout(new FlowLayout());
		JButton b	=	new JButton("ø°«Ï«Ï");
		this.add(b);
		this.setVisible(true);
	}
	
	
	


public static void main(String[]args) {

	Ex e	=	new Ex();
	
	
	
}
}