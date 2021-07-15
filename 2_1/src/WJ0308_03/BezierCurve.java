package WJ0308_03;

import javax.swing.*;

import WJ0311_05.FileChooserDemo;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;;

public class BezierCurve extends JPanel implements MouseListener,MouseMotionListener{

	private	int [] xs = {50,150,400,450}; 	// �� ��ǥ
	private int [] ys = {200,50,300,200}; 	// �� ��ǥ
	
	private int drageIndex	=	-1;			//
	
	public BezierCurve() {
		this.setSize(1000,1000);
		setVisible(true);
		
		
	}

	@Override
	public void paintComponent(Graphics g) {
		//�� 4�� ���
		
		g.setColor(Color.blue);//���� 
		g.fillRect(xs[0], ys[0], 16,16);// ����ġ, ��ũ��
		g.fillRect(xs[2], ys[2], 16,16);// ����ġ, ��ũ��
	
		g.setColor(Color.red);
		g.fillRect(xs[1], ys[1], 16,16);// ����ġ, ��ũ��
		g.fillRect(xs[3], ys[3], 16,16);// ����ġ, ��ũ��
		
		//�� 4���� �̿��ؼ� ������ � �׸���..
		
		Graphics2D g2d	=	(Graphics2D)g;
		g2d.setColor(Color.BLACK);
		GeneralPath path	=	new GeneralPath();
		path.moveTo(xs[0], ys[0]);
		path.curveTo(xs[1],ys[1],xs[2],ys[2],xs[3],ys[3]);
		
		g2d.draw(path);
		
		
		
		
	}
	
	
	@Override //���콺 ����������
	public void mousePressed(MouseEvent e) {
		drageIndex	=	-1;
		//4���� �� �߿��� � ���� ������� �˻�..
		e.getX(); e.getY();
		
		for (int i=0;i<4;i++) {
			Rectangle r	=	new Rectangle(xs[i]-4,ys[i]-4,20,20);//���������� �����Ӱ� �˻��Ϸ��� -4�� ��..)
			if (r.contains(e.getX(),e.getY())== true) {
				drageIndex	=	 i;
				break;
			}
		}
//		repaint();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		drageIndex 	=	-1;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(drageIndex != -1) {
			xs[drageIndex]	=	e.getX();
			ys[drageIndex]	=	e.getY();
		}
		repaint();
	}
	
	//4���� ������..
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	}
	
	
	public static void main(String[]args) {
		
		new BezierCurve();
	}

}




