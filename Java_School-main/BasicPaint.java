import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f	=	new JFrame("±×·¡ÇÈ");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,200);
		f.setVisible(true);
		
	}

}
class MyPanel extends JPanel{
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
	}
}