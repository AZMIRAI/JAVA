package ex09;

import javax.swing.*;

public class frame extends JFrame{

	public frame() {
		
		this.setTitle("�µ���ȯ��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel	panel	=	new JPanel();
		this.add(panel);
		
		JLabel label1	=	new JLabel("ȭ���µ�");
		JLabel label2	=	new JLabel("�����µ�");
		JTextField field1	=	new JTextField(15);
		JTextField field2	=	new JTextField(15);
		JButton	button	=	new JButton("��ȯ");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		this.setSize(300,150);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame	a	=	new frame();
	}

}
