package WJ0308_01;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;// BufferedImage�� ������
import java.io.File;
import java.io.IOException;







public class MyPanel extends JPanel implements ActionListener{

	private Timer timer; //Ÿ�̸� awt ��Ű��
	private BufferedImage image; //�̹����� �ҷ���
	private final int START_X	=	0;
	private final int START_Y	=	250;
	private int x,y;
	
	public MyPanel() {
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(500,300));
		this.setDoubleBuffered(true);
		
		
		File  file	=	new File("space.jpg");
		System.out.println(file.getAbsolutePath());
		
		try {
			image	=	ImageIO.read(file);
				
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		} 

		x=START_X;
		y=START_Y;
		
		
		
		timer =	new Timer(20,this);
		timer.start();
		
	}
	


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image,x,y,this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	// �̹����� x,y��ǥ�� ������ ����	
		x += 1;
		y -= 1;
	repaint();	//ȭ���� �ٽ� �׸���
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame	f	=	new JFrame();
		f.add(new JFrame());
		f.setTitle("�׽�Ʈ");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1024,768);
		f.setVisible(true);
	}

}
