package WJ0311_05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FileChooserDemo extends JFrame implements ActionListener{
	
	private JButton openBtn, saveBtn;
	//���� ��ư 
	//���� ��ư
	JFileChooser fileChooser;
	//���� ����
	public FileChooserDemo() {
		
	this.setTitle("���� ���ñ� �׽�Ʈ");
	//���α׷��̸� 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//�ݱ� ��ư�� ������ ����
	this.setSize(250,200);
	//���α׷� ������
	fileChooser = new JFileChooser();
	//���� ���� ��ü ����
	
	JLabel label = new JLabel("���� ���ñ� ������Ʈ �׽�Ʈ �Դϴ�");
	//�� ����
	openBtn = new JButton("���� ����");
	//���� ���� ��ư ����
	openBtn.addActionListener(this);
	
	saveBtn = new JButton("���� ����");
	//���� ���� ��ư ����
	saveBtn.addActionListener(this);
	
	JPanel panel = new JPanel();
	panel.add(label);
	panel.add(openBtn);
	panel.add(saveBtn);
	
	this.add(panel);
	this.setVisible(true);
	
	
	
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == openBtn) {
			int returnVal = fileChooser.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION){
				File file = fileChooser.getSelectedFile();
				System.out.println("open file : "+file.getAbsolutePath());
		} else {
			System.out.println("No file selected");
		}
	}else if (e.getSource()==saveBtn) {
		int returnVal = fileChooser.showSaveDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file =fileChooser.getSelectedFile();
			System.out.println("save to "+ file.getAbsolutePath());
		}else {
			System.out.println("save canceled...");
		}
	
	
	}
	}

public static void main(String[] args) {
	new FileChooserDemo();
}
}