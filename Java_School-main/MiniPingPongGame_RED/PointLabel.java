package MiniPingPongGame_RED;

import javax.swing.JLabel;

//������ ��
public class PointLabel extends JLabel{ 
  
  private int point1=0;
  private int point2=0;   // Ȥ�� �ʱ�ȭ�� �ȉ�ٴ� ������ ���� 0���� �ʱ�ȭ
  
  // �� ó�� ������ 0:0
  public PointLabel()
  {

      this.setText("0 : 0");
  }

  // �ܺο��� ������ �޾ƿ��� �޼ҵ�
  void setPoint(int point1, int point2)
  {
      this.point1=point1;
      this.point2=point2;
      
  }

  // ������ �ٲ��ִ� �޼ҵ�
  void setPointPanel()
  {
      this.setText(point1 + " : " + point2);
  }
}