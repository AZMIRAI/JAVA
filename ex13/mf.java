package ex13;

import javax.swing.*;
import java.awt.*;

public class mf extends JFrame{

	public mf() {
		
		this.setTitle("my frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200);
		
		JPanel	p	=	new JPanel();
		p.setLayout(new FlowLayout());
		
		for(int i=0;i<10;i++) {
			p.add(new JButton("Button"+1));
		}
		this.add(p);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mf	a=	new mf(); 
	}

}
