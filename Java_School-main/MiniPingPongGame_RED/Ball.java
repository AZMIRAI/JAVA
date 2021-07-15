package MiniPingPongGame_RED;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
    private static final int RADIUS=20;
    int x=0;
    int y=0;
    int xSpeed=1;
    int ySpeed=1;
    private GameBoard game;
    private PointLabel point;
    Color color;
    int speed=1;
    int point1=0;
    int point2=0;

    public Ball(GameBoard game, Color color)
    {
        this.game=game;
        this.color=color;
    }

    void move()
    {
        //+speed �� �� �ٴ��� ���� �� ���µ��� �� ���ư��µ�
        if(x<0)     
        {
            //xSpeed=(1+speed);
            reset();                // ���� ���� ���� ������ ������ �ʱ�ȭ
            point2++;               // ����� ���� +1
            //System.out.println("point2 : " + point2);
        }
            
        if(x>=game.getWidth() - 2*RADIUS)
        {
            //xSpeed=-(1+speed);
            reset();                // ���� ���� ���� ������ ������ �ʱ�ȭ
            point1++;               // ����� ���� +1;
            //System.out.println("point1 : " + point1);
        }
            
        if(y<0)
        {
            ySpeed=-(ySpeed);       // y�� �ݴ�� �����̴� �Ŷ� ��ȣ�� �ٲ���
            //System.out.println("y + ySpeed<0");
        }
           
        if(y>= game.getHeight() -2*RADIUS)
        {
            ySpeed=-(ySpeed);       // y�� �ݴ�� �����̴� �Ŷ� ��ȣ�� �ٲ���
            //System.out.println("y + ySpeed > game.getHeight() -2*RADIUS");
        }
            
        if(collision())
        {
            // ������ ����⿡ ���� ������� ���� �ӷ��� ������ 

            xSpeed = -(xSpeed);
            if(xSpeed>=0)
                xSpeed+=speed;
            else
                xSpeed-=speed;
            
            if(ySpeed>=0)
                ySpeed+=speed/2;
            else
                ySpeed-=speed/2;
            
            
            speed++;        // �ӷ��� ���� ����
            
        }
        
        x = x+xSpeed;
        y = y+ySpeed;
    }

    private boolean collision()
    {
        return game.racquet1.getBounds().intersects(getBounds()) || game.racquet2.getBounds().intersects(getBounds());
    }

    public void draw(Graphics2D g)
    {
        g.setColor(color);
        g.fillOval(x,y,2*RADIUS, 2*RADIUS);
    }

    public Rectangle getBounds()
    {
        return new Rectangle(x,y,2*RADIUS, 2*RADIUS);
    }

    public void reset()
    {
        x=0;
        y=0;
        xSpeed=1;
        ySpeed=1;
        speed=1;
    }

    // �����ǿ� ���� ������ ȣ���ϴ� �޼ҵ�
    int getPoint1()
    {
        return point1;
    }
    int getPoint2()
    {
        return point2;
    }
}