package FileChooserDemo;
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
	//열기 버튼 
	//저장 버튼
	JFileChooser fileChooser;
	//파일 열기
	public FileChooserDemo() {
		
	this.setTitle("파일 선택기 테스트");
	//프로그램이름 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//닫기 버튼을 누른후 반응
	this.setSize(250,200);
	//프로그램 사이즈
	fileChooser = new JFileChooser();
	//파일 여는 객체 생성
	
	JLabel label = new JLabel("파일 선택기 컴포넌트 테스트 입니다");
	//라벨 생성
	openBtn = new JButton("파일 오픈");
	//파일 오픈 버튼 생성
	openBtn.addActionListener(this);
	
	saveBtn = new JButton("파일 저장");
	//파일 저장 버튼 생성
	saveBtn.addActionListener(this);
	
	JPanel panel = new JPanel();
	//패널만들기
	panel.add(label);
	//패널에 라벨붙히기
	panel.add(openBtn);
	//패널에 오픈버튼붙히기
	panel.add(saveBtn);
	//패널에 세이브버튼붙히기
	
	this.add(panel);
	//패널을붙히기
	this.setVisible(true);
	//실행
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == openBtn) {
			int returnVal = fileChooser.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION){
				File file = fileChooser.getSelectedFile();
				System.out.println("open file : "+file.getAbsolutePath());
				//절대경로를출력
		} else {
			System.out.println("No file selected");
			//오픈 취소하면
		}
	}else if (e.getSource()==saveBtn) {
		int returnVal = fileChooser.showSaveDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file =fileChooser.getSelectedFile();
			System.out.println("save to "+ file.getAbsolutePath());
			//절대경로를 출력
		}else {
			System.out.println("save canceled...");
			//세이브 취소하면
		}
	
	
	}
	}

public static void main(String[] args) {
	new FileChooserDemo();
}
}