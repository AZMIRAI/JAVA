package MiniPingPongGame_RED;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet {
    private static final int WIDTH=10;
    private static final int HEIGHT=80;
    int x=0;
    int y=0;
    Color color;
    int xSpeed=0;
    int ySpeed=0;
    private GameBoard game;
    int racekt=0;

    public Racquet(GameBoard game, int x, int y, Color color, int racket)
    {
        this.game=game;
        this.x=x;
        this.y=y;
        this.color=color;
        this.racekt=racket; // ���� 1,2�� �����ϱ� ����
    }

    public void move()
    {
        if(y + ySpeed > 0 && y+ySpeed < game.getHeight() - HEIGHT)
            y=y+ySpeed;
    }

    public void draw(Graphics2D g)
    {
        g.setColor(color);
        g.fillRect(x,y,WIDTH,HEIGHT);
    }

    public void keyReleased(KeyEvent e)
    {
        ySpeed=0;
    }

    public void keyPressed(KeyEvent e)  // Ű���带 ������ �ö��� 1�� 1������ ���� 2�� 2�����θ� �۵��ϵ��� �� ���� �۵��ϵ��� ����
    {
        if(racekt==2)
        {
            if(e.getKeyCode() == KeyEvent.VK_UP)
                ySpeed=-3;
            if(e.getKeyCode()==KeyEvent.VK_DOWN)
                ySpeed=3;
        }
        if(racekt==1)
        {
            if(e.getKeyCode() == 87)
                ySpeed=-3;
            if(e.getKeyCode()== 83)
                ySpeed=3;
        }
        

        //System.out.println(e.getKeyCode());
    }

    public Rectangle getBounds()
    {
        return new Rectangle(x,y,WIDTH,HEIGHT);
    }
}
