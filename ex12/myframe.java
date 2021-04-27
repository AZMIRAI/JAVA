package ex12;

import javax.swing.*;
import java.awt.*;
public class myframe extends JFrame{

	JButton	b1;
	private JButton b2,b3;
	
	public myframe() {
	this.setTitle("Àý´ë");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(400,200);
	JPanel	p	=	new JPanel();
	p.setLayout(null);
	
	b1	=	new JButton("button #1");
	b2	=	new JButton("button #2");
	b3	=	new JButton("button #3");
	
	p.add(b1);
	p.add(b2);
	p.add(b3);
	
	b1.setBounds(20,5,95,30);
	b2.setBounds(55,45,105,70);
	b3.setBounds(180,15,105,90);
	this.add(p);
	this.setVisible(true);
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe	a=	new myframe();
	}

}
