package WJ0304_01;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;

import javax.swing.JFrame;

public class GradientPanel extends MyPanel{
	
		@Override
		public void paintComponent(Graphics g) {
				Graphics2D g2	=	(Graphics2D)g;
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
									RenderingHints.VALUE_ANTIALIAS_ON);
				GradientPaint gp	=	new GradientPaint(0,0,Color.WHITE,0,70,Color.RED);
				for(Shape s : shapeArray) {
//					g2.setPaint(Color.red); //이건원색
					g2.setPaint(gp);	// 그라디언트
					g2.fill((s));
				}
		}
		public static void main(String[]args) {
			JFrame frame	=	new JFrame();
			
			frame.add(new GradientPanel());
			frame.setSize(600,130);
			frame.setTitle("그라디언트");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(new GradientPanel());
			frame.setVisible(true);
			
		}
}
