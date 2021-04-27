package ex10;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class frame extends JFrame{

	public frame() {
		
		JPanel main	=	new JPanel();
		JPanel a	=	new JPanel();
		JPanel b	=	new JPanel();
		
		JLabel	label	=	new JLabel("자바 피자에 오신것을 환영합니다!");
		a.add(label);
		
		JButton b1	=	new JButton("콤보피자");
		JButton b2	=	new JButton("불고기피자");
		JButton b3	=	new JButton("치즈피자");
		JTextField text	=	new JTextField(20);
		JLabel	label1	=	new JLabel("갯수");
		

		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(label1);
		b.add(text);
		
		
		
		main.add(a);
		main.add(b);
		this.add(main);
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame	a	=	new frame();
	}

}
