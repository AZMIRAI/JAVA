package ex10;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class frame extends JFrame{

	public frame() {
		
		JPanel main	=	new JPanel();
		JPanel a	=	new JPanel();
		JPanel b	=	new JPanel();
		
		JLabel	label	=	new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�!");
		a.add(label);
		
		JButton b1	=	new JButton("�޺�����");
		JButton b2	=	new JButton("�Ұ������");
		JButton b3	=	new JButton("ġ������");
		JTextField text	=	new JTextField(20);
		JLabel	label1	=	new JLabel("����");
		

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
