package ex07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{

	public MyFrame() {
		
		this.setTitle("피자주문");
		this.setSize(600,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel	panel	=	new JPanel();
		panel.setBackground(Color.BLUE);
		JPanel	panelA	=	new JPanel();

		JPanel	panelB	=	new JPanel();
		
		JLabel	label1	=	new JLabel("자바 피자에 오신것을 환영합니다 피자 종류를 선택하시오");
	
		panelA.add(label1);
		
		JButton	button1	=	new JButton("콤보피자");
		JButton	button2	=	new JButton("포테이토피자");
		JButton	button3	=	new JButton("불고기피자");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel	label2	=	new JLabel("갯수");
		JTextField field1	=	new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		this.add(panel);
		this.setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame	a	=	new MyFrame();
	}

}
