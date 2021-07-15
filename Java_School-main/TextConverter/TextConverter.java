package TextConverter;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextConverter extends JFrame implements ActionListener{
	JButton convertBtn;
	JButton cancelBtn;
	JTextArea textIn;
	JTextArea textOut;
	public	TextConverter() {
		
		super("�ؽ�Ʈ��ȯ");
		
		textIn = new JTextArea(10,14);
		textOut	=	new JTextArea(10,14);
		textIn.setLineWrap(true);
		textOut.setLineWrap(true);
		textOut.setEnabled(false);
		JPanel textAreaPanel = new JPanel (new GridLayout(1,2,20,20));
		textAreaPanel.add(textIn);
		textAreaPanel.add(textOut);
		
		convertBtn = new JButton("��ȯ");
		cancelBtn = new JButton("���");
		convertBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(convertBtn);
		buttonPanel.add(cancelBtn);
		
		JPanel mainPanel = new JPanel(new BorderLayout(10,10));
		mainPanel.add(BorderLayout.CENTER,textAreaPanel);
		mainPanel.add(BorderLayout.SOUTH,buttonPanel);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		this.add(mainPanel);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextConverter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			if (e.getSource()==convertBtn) {
			
			textOut.setText("");
			String result = toEnglish(textIn.getText());
			textOut.append(result);
		}
			
		if(e.getSource()==cancelBtn) {
			
			textOut.setText("");
		}
	}
	
	private String toEnglish(String korean) {
		String result = korean;
		result = result.replace("�ؽ�Ʈ", "text");
		result = result.replace("����", "english");
		return result;
	}

}
