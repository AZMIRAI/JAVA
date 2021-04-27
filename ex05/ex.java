package ex05;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ex extends JFrame {

	public ex() {
		Toolkit kit	=	Toolkit.getDefaultToolkit();
		Dimension screenSize	=	kit.getScreenSize();
		this.setSize(300,200);
		this.setLocation(screenSize.width/2,screenSize.height/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("¸Þ··");
		Image img 	=	kit.getImage("icon.gif");
		this.setIconImage(img);
		this.setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex	ojb	=	new ex();
	}

}
