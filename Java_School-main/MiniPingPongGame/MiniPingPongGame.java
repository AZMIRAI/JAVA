package MiniPingPongGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MiniPingPongGame extends JPanel implements KeyListener{

	private Ball ball;
	protected Racquet racquet1;
	protected Racquet racquet2;
	
	public MiniPingPongGame() {
		ball = new Ball (this,Color.white);
		this.setBackground(Color.black);
		racquet1 = new Racquet(this,10, 150,Color.blue);
		racquet2 = new Racquet(this, 560, 150,Color.red);
		this.setFocusable(true);
		this.addKeyListener(this);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("PingPong Game");
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		MiniPingPongGame game = new MiniPingPongGame();
		frame.add(game);
		frame.setVisible(true);
		while (true) {
			game.move();
			game.repaint();
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		racquet1.keyPressed(e);
		racquet2.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		racquet1.keyReleased(e);
		racquet2.keyReleased(e);
		// TODO Auto-generated method stub
		
	}
	void move() {
		ball.move();
		racquet1.move();
		racquet2.move();
	}
	
	@Override
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		ball.draw(g2d);
		racquet1.draw(g2d);
		racquet2.draw(g2d);
	}
	
	
	
	
	class Racquet{
		
		private static final int WIDTH = 10;
		private static final int HEIGHT = 80;
		private int x= 0,y=0;
		private int xSpeed = 0;
		private int ySpeed = 0;
		private MiniPingPongGame game;
		private Color color;
		
		public Racquet(MiniPingPongGame game,int x , int y,Color color) {
			
			this.game = game;
			this.x		=	x;
			this.y		= y;
			this.color = color;
		}
		
		
		public void move() {
			if(y+ySpeed>0&&y+ySpeed< game.getHeight()-HEIGHT)
				y += ySpeed;
		}
		
		public void draw (Graphics2D g) {
			g.setColor(color);
			g.fillRect(x, y, WIDTH, HEIGHT);
		}
		
		public void keyReleased(KeyEvent e) {
			ySpeed = 0;
			
		}
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode() == KeyEvent.VK_UP)
				ySpeed = -3;
			
			else if(e.getKeyCode()==KeyEvent.VK_DOWN)
			ySpeed = 3;
		}
		
		public Rectangle getBounds() {
			return new Rectangle(x,y,WIDTH,HEIGHT);
		}
		
	}
	
	
	
	class Ball {
		private static final int RADIUS = 20;
		private int x = 0,y=0, xSpeed=1,ySpeed =1;
		private MiniPingPongGame game;
		private Color color;
		
		public Ball(MiniPingPongGame game, Color color) {
			this.game = game;
			this.color = color;
		}
		
		void move() {
			if(x+xSpeed<0) 
				xSpeed = 1;
			if(x+xSpeed > game.getWidth()-2*RADIUS)
				xSpeed = -1;
			if(y+ySpeed <0)
				ySpeed = 1;
			if(y+ySpeed> game.getHeight()-2*RADIUS)
				ySpeed = -1;
			if(collision())
				xSpeed = -xSpeed;
				
			x += xSpeed;
			y += ySpeed;
						
					}
		private boolean collision() {
			boolean r1c =   game.racquet1.getBounds().intersects(getBounds());
			boolean r2c = 	game.racquet2.getBounds().intersects(getBounds());
					return r1c ||r2c;
		}
		
		public void draw(Graphics2D g) {
			g.setColor(color);
			g.fillOval(x,y,2*RADIUS, 2 *RADIUS);
		}
		public Rectangle getBounds() {
			return new Rectangle(x,y,2*RADIUS,2*RADIUS); 
					
		}
		

	}
	
//	public class Score {
//		private static int GAME_WIDTH;
//		private static int GAME_HEIGHT;
//		protected int player1;
//		protected int player2;
//		public Score(int gameWidth,int gameHeight) {
//			GAME_HEIGHT = 	gameWidth;
//			GAME_WIDTH	=	gameHeight;
//			
//		}
//		
//		public Score(int gameWidth, int gameHeight) {
//			GAME_WIDTH = gameWidth;
//			GAME_HEIGHT = gameHeight;
//		}
//		public void draw(Graphics g) {
//			
//			g.setColor(Color.white);
//			g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,60));
//			g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
//			g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), GAME_WIDTH/2 -85, 50)
//			g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), GAME_WIDTH/2 +20, 50);
//		}
//	}
	
	
	
}
