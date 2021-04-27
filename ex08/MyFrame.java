package ex08;

import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{

		public MyFrame() {
			
			this.setSize(500,500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("FlowLayOut");
			
			
			JPanel	j	=	new JPanel();
//			this.setLayout(new FlowLayout());
			JButton	b1	=	new JButton("Button 1");
			JButton	b2	=	new JButton("Button 2");
			JButton	b3	=	new JButton("Button 3");
			JButton	b4	=	new JButton("Long-Named Button 4");
			JButton	b5	=	new JButton("5");
			JCheckBox	c	=	new JCheckBox("¶ö¶ö¶ö");
			
			j.add(b1);
			j.add(b2);

			j.add(b3);
			j.add(b4);
			j.add(b5);
			j.add(c);
			add(j);
			this.setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyFrame	a	=	new MyFrame();
	}

}
