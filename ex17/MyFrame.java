package ex17;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends 	JFrame{

	JPanel a;

	public MyFrame() {
		this.setTitle("¿Ã∏ß");
		this.setSize(300,300);
		a	=	new JPanel();
		a.setLayout(new FlowLayout());
		for (int i=0;i<10;i++) {
			a.add(new JButton("BUTTON "+i));
			
		}
		this.add(a);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame a	=	new MyFrame();
	}

}
