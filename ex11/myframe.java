package ex11;

import javax.swing.*;
import java.awt.*;
public class myframe extends JFrame{

	public myframe() {
		
		this.setTitle("GridLayoutTest");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0,3));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Button5"));
		
		pack();
		
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe	a	=	new myframe();
	}

}
