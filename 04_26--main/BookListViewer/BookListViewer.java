package BookListViewer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class BookListViewer extends JFrame implements ActionListener{

	private JTextField 	idField, titleField,publisherField,
						yearField,priceField,authorField;
	private JButton 	previousBtn,nextBtn,insertBtn,finishBtn;
	
	private static final String JDBC_DRIVER 	=	"org.mariadb.jdbc.Driver"; //풀네임
	private static final String DB_SERVER_URL	=	"jdbc:mysql://localhost:3306/oop";
	private static final String	DB_USER			=	"root";
	private static final String DB_USER_PW		=	"1111";
	private ResultSet rs;
	private Connection con = null;
	public BookListViewer() throws Exception {
		/*
		 	DB에서 책 레코드들을 가져오자.
		 	1. JDBC 드라이버 적재
		 	2. DB 연결
		 	3. PreparedStatement 객체생성
		 	4. SQL문 실행
		 */
		
		Class.forName(JDBC_DRIVER);
		con = DriverManager.getConnection(DB_SERVER_URL, DB_USER, DB_USER_PW);
		String sql = "select * from books order by book_id desc";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// select 문을 실행 할 때에는 executeQuery() 메서드를 사용하고
		// 그 외, insert, delete, update 문을 실행할때는
		// executeUpdate() 메서드를 사용한다
		
		
		rs = pstmt.executeQuery();
		
		// 이 JFrame 객체(this)의 Layout을 GridLayout으로 설정(0,2)
		this.setLayout(new GridLayout(0,2));
		
		// 컴포넌트들을 생성
		// 생성된 컴포넌트들을 JFrame 객체(this)에 추가한다
				this.add(new JLabel("ID",JLabel.CENTER));
				idField = new JTextField(10);
				this.add(idField);
				
				this.add(new JLabel("Title",JLabel.CENTER));
				titleField = new JTextField(10);
				this.add(titleField);
				
				this.add(new JLabel("Publisher",JLabel.CENTER));
				publisherField = new JTextField(10);
				this.add(publisherField);
				
				this.add(new JLabel("Year",JLabel.CENTER));
				yearField = new JTextField(10);
				this.add(yearField);
				
				this.add(new JLabel("Price",JLabel.CENTER));
				priceField = new JTextField(10);
				this.add(priceField);
				
		// 버튼 컴포넌트들의 액션리스너를 이 객체(this)로 설정한다.
				
				previousBtn = new JButton("Previous");
				previousBtn.addActionListener(this);
				this.add(previousBtn);
		
				nextBtn = new JButton("Next");
				nextBtn.addActionListener(this);
				this.add(nextBtn);
		
				insertBtn = new JButton("Insert");
				insertBtn.addActionListener(this);
				this.add(insertBtn);
		
				finishBtn = new JButton("Finish");
				finishBtn.addActionListener(this);
				this.add(finishBtn);
				
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				this.setResizable(false);
				this.setSize(350,200);
				this.setVisible(true);
				
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// BookListViewer 클래스의 인스턴트 생성
		
		new BookListViewer();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		
			if (e.getSource() == previousBtn) {
				System.out.println("previousBtn clicked...");
				// 결과집합의 커서를 이전으로 이동하고
				rs.previous();
				// 그 커서가 가리키는 결과 레코드의 칼럼 값을 뽑아 와서
				// 적절한 JTextfield에 값으로 설정
				setCurrnetBookInfo2TextField();
			}else if (e.getSource() == nextBtn) {
				System.out.println("nextBtn clicked...");
				// 결과집합의 커서를 이전으로 이동하고
				rs.next();
				// 그 커서가 가리키는 결과 레코드의 칼럼 값을 뽑아 와서
				// 적절한 JTextfield에 값으로 설정
				setCurrnetBookInfo2TextField();
			}else if (e.getSource() == insertBtn) {
				System.out.println("insertBtn clicked...");
				String title = titleField.getText();
				String publisher = publisherField.getText();
				String year = yearField.getText();
				String price = priceField.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date date = new Date(sdf.parse(year).getTime());
				//java.util.Date 객체로부터 java.sql.Date 객체생성
				
				String sql = "insert into books(title,publisher,year,price) values(?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1,title);
				pstmt.setString(2,publisher);
				pstmt.setDate(3,date);
				pstmt.setInt(4,Integer.parseInt(price));
				
				pstmt.executeUpdate();
				JOptionPane.showMessageDialog(this,"책 등록 성공","성공",JOptionPane.INFORMATION_MESSAGE);;
				
		
			}else if (e.getSource() == finishBtn) {
				System.out.println("finishBtn clicked...");
				System.out.println("exit programe");
				rs.close();
				con.close(); // DB서버 종료
				System.exit(0); // 프로세스를 종료시킨다
				this.dispose();
				}
		// TODO Auto-generated method stub
	}catch (Exception err) {
		System.out.println(err.getMessage());
		err.printStackTrace();	
	}
	}
	
	private void setCurrnetBookInfo2TextField() throws Exception{
		// book_id, title, publisher, year,price
		int bookId 			= rs.getInt("book_id");
		String title 		= rs.getString("title");
		String publisher	= rs.getString("publisher");
		Date year 			= rs.getDate("year");
		Integer price 		= rs.getInt("price");
		
		idField.setText(String.valueOf(bookId));
		titleField.setText(title);
		publisherField.setText(publisher);
		yearField.setText(year.toString());
		priceField.setText(String.valueOf(price));
		
		
	}
}

// 여기서 다음으로 넘어가면 6부터 나옴
