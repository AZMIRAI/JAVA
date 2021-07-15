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
		this.setSize(600,180); //this 없어도됨 크기0
		this.setTitle("JAVA 20 SHAPES"); //프로그램 제목
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //엑스박스 누르면
		JPanel panel = new MyPanel();
		this.add(panel);
		this.setVisible(true);
	}
	public static void main(String[]args) {
		new MoreShapes();
	}
}

class MyPanel extends JPanel {//그리기
	ArrayList<Shape> shapeArray	=	new ArrayList<Shape>();
	public MyPanel() {
//		new Rectangle2D.Float();
		//두개다 사용 가능
//		Rectangle2D rect	=	new Rectangle2D.Float(10,10,70,80);//x,y,높이,폭
//		Shape rect	=	new Rectangle2D.Float(10,10,70,80);//x,y,높이,폭
//		Rectangle2D rect	=	new Rectangle2D.Float(10,10,70,80);//x,y,높이,폭
		
//		Shape rect	=	new Rectangle2D.Float(10,10,70,80);//x,y,높이,폭
//		shapeArray.add(rect);//상위 호환

		shapeArray.add(new Rectangle2D.Float(10,10,70,80));//상위 호환
		shapeArray.add(new RoundRectangle2D.Float(110,10,70,80,20,20));
		//20 , 20 사각형의 꼭짓점쪽 크면 클수록 곡선이 커짐
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
		//선을 부드럽게 만들어줌
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		for (Shape s : shapeArray) {
			g2.draw(s);//나중에 재사용 가능
		}
		
	}
}