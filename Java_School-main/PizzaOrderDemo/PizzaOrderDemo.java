package PizzaOrderDemo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PizzaOrderDemo extends JFrame implements ActionListener{

	private int sum, temp1,temp2,temp3;
	//temp1 �������� temp2 ���� temp3 ����������
	private JButton orderBtn, cancelBtn;
	//
	private JPanel orderPanel;
	private JTextField priceField;
	
	JPanel welcomePanel	=	new WelcomePanel();
	//�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�~ ����ū �г�.
	JPanel typePanel = new TypePanel();
	//���� �г�
	JPanel toppingPanel	= new ToppingPanel();
	//���� �г�
	JPanel sizePanel	=	new SizePanel();
	//ũ�� �г�
	public PizzaOrderDemo() {
		this.setSize(500,200);
		//�����ӻ�����
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//�ݱ��ư ������
		this.setTitle("���� �ֹ�");
		//����
		orderBtn = new JButton ("�ֹ�");
		orderBtn.addActionListener(this);
		//�ϴ� �ֹ� ��ư
		
		cancelBtn	=	new JButton("���");
		cancelBtn.addActionListener(this);
		//�ϴ� ��� ��ư
		
		priceField = new JTextField();
		priceField.setEditable(false);
		priceField.setColumns(6);
		//�ϴ� ���� â
		
		orderPanel = new JPanel();
		orderPanel.add(orderBtn);
		orderPanel.add(cancelBtn);
		orderPanel.add(priceField);
		//��ư ������
		
		this.add(welcomePanel,BorderLayout.NORTH);
		//����
		this.add(orderPanel,BorderLayout.SOUTH);
		//�Ʒ���
		this.add(sizePanel,BorderLayout.EAST);
		//����
		this.add(typePanel,BorderLayout.WEST);
		//����
		this.add(toppingPanel,BorderLayout.CENTER);
		//�߾�
		this.setVisible(true);
		//����
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==orderBtn) {
			// ���� ĵ��  .. 
			
			
			
			
			sum=temp1+temp2+temp3;
			
			priceField.setText(String.valueOf(sum));
			System.out.println("temp1:" + temp1 + ", temp2:"+temp2+", temp3:"+temp3);
			
			
		}else if (e.getSource()== cancelBtn) {
		 temp1=0;
		 temp2=0;
		 temp3=0;
		 sum=0;
		 priceField.setText(String.valueOf(sum));
		}
		
		
	}
	
	class WelcomePanel extends JPanel{
		
		private JLabel message;
		
		public WelcomePanel () {
			
			message = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�.");
			this.add(message);
		
		}
	}

	class TypePanel extends JPanel implements ActionListener{
		
		private JRadioButton combo, potato, bulgogi;
		private ButtonGroup btnGroup;
		
		public TypePanel() {
		this.setLayout(new GridLayout(3,1));
		combo = new JRadioButton("�޺� (20000)",true);
		combo.addActionListener(this);
		potato = new JRadioButton("�������� (21000)");
		potato.addActionListener(this);
		bulgogi = new JRadioButton("�Ұ�� (19000)");
		bulgogi.addActionListener(this);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(combo);
		btnGroup.add(potato);
		btnGroup.add(bulgogi);
		
		this.setBorder(BorderFactory.createTitledBorder("����"));
		//�������ִ� �׵θ������
		
		this.add(combo);
		this.add(potato);
		this.add(bulgogi);
		
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==combo) {
				temp1 = 20000;
			}else if(e.getSource()==potato) {
				temp1 = 21000;
			}else if (e.getSource()==bulgogi){
				temp1 = 19000;
			}
			
		}
		
	
	}
	
	class ToppingPanel extends JPanel implements ActionListener{
		
		private JRadioButton pepper, cheese, peperoni,bacon;
		private ButtonGroup btnGroup;
		
		public ToppingPanel() {
			
			this.setLayout(new GridLayout(4,1));
			
			pepper = new JRadioButton("�Ǹ� (2000)",true);
			pepper.addActionListener(this);
			cheese = new JRadioButton("ġ�� (2000)");
			cheese.addActionListener(this);
			peperoni = new JRadioButton("����δ� (3000)");
			peperoni.addActionListener(this);
			bacon = new JRadioButton("������ (3000)");
			bacon.addActionListener(this);
			
			btnGroup = new ButtonGroup();
			btnGroup.add(pepper);
			btnGroup.add(cheese);
			btnGroup.add(peperoni);
			btnGroup.add(bacon);
			
			this.setBorder(BorderFactory.createTitledBorder("�߰�����"));
			
			this.add(pepper);
			this.add(cheese);
			this.add(peperoni);
			this.add(bacon);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==pepper) {
				
				temp2 = 2000;
			}else if(e.getSource()==cheese) {
				temp2 = 2000;
			}else if(e.getSource()==peperoni) {
				temp2 = 3000;
			}else if(e.getSource()==bacon) {
				temp2 = 3000;
			}
			
		}
		
	}
	
	class SizePanel extends JPanel implements ActionListener{
		private JRadioButton small, medium, large;
		private ButtonGroup btnGroup;
		
		public SizePanel() {
			this.setLayout(new GridLayout(3,1));
			small = new JRadioButton("Small",true);
			small.addActionListener(this);
			medium = new JRadioButton("Midium (2000)");
			medium.addActionListener(this);
			large = new JRadioButton("Large (4000)");
			large.addActionListener(this);
			
			btnGroup = new ButtonGroup();
			btnGroup.add(small);
			btnGroup.add(medium);
			btnGroup.add(large);
			this.setBorder(BorderFactory.createTitledBorder("ũ��"));
			this.add(small);
			this.add(medium);
			this.add(large);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==small) {
				temp3=0;
			}else if (e.getSource()==medium) {
				temp3=2000;
			}else if (e.getSource()==large){
				temp3=4000;	
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PizzaOrderDemo();
	}
	
}
