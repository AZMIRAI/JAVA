package WJ0304_01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

public class MoreShapes extends JFrame {
	
	public MoreShapes() {
		this.setSize(600,180); //this ����� ũ��0
		this.setTitle("JAVA 20 SHAPES"); //���α׷� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����ڽ� ������
		JPanel panel = new MyPanel();
		this.add(panel);
		this.setVisible(true);
	}
	public static void main(String[]args) {
		new MoreShapes();
	}
}

class MyPanel extends JPanel {//�׸���
	ArrayList<Shape> shapeArray	=	new ArrayList<Shape>();
	public MyPanel() {
//		new Rectangle2D.Float();
		//�ΰ��� ��� ����
//		Rectangle2D rect	=	new Rectangle2D.Float(10,10,70,80);//x,y,����,��
//		Shape rect	=	new Rectangle2D.Float(10,10,70,80);//x,y,����,��
//		Rectangle2D rect	=	new Rectangle2D.Float(10,10,70,80);//x,y,����,��
		
//		Shape rect	=	new Rectangle2D.Float(10,10,70,80);//x,y,����,��
//		shapeArray.add(rect);//���� ȣȯ

		shapeArray.add(new Rectangle2D.Float(10,10,70,80));//���� ȣȯ
		shapeArray.add(new RoundRectangle2D.Float(110,10,70,80,20,20));
		//20 , 20 �簢���� �������� ũ�� Ŭ���� ��� Ŀ��
		shapeArray.add(new Ellipse2D.Float(210,10,80,80));
		shapeArray.add(new Arc2D.Float(310,10,80,80,90,90,Arc2D.OPEN));
		shapeArray.add(new Arc2D.Float(410,10,80,80,0,180,Arc2D.CHORD));
		shapeArray.add(new Arc2D.Float(510,10,80,80,45,45,Arc2D.PIE));
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D	g2	=	(Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//���� �ε巴�� �������
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		for (Shape s : shapeArray) {
			g2.draw(s);//���߿� ���� ����
		}
		
	}
}