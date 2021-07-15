package JSONReader;

import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
import com.google.gson.Gson;
import java.sql.*;

public class JSONReader {

	public static void main (String[] args) throws Exception{
		String site = "https://jsonplaceholder.typicode.com/posts";
		
		URL url = new URL(site);
		
		URLConnection con = url.openConnection();
	
		InputStream stream = con.getInputStream();
		
		InputStreamReader reader = 
				new InputStreamReader(stream, "UTF-8");
		
		BufferedReader bufReader = new BufferedReader(reader);
		
		String line = null;
		
		String jsonString = "";
		while ((line = bufReader.readLine()) != null){
//			System.out.println(line);
			jsonString +=line;
		}

//		System.out.println(jsonString);
	
		
		Gson gson = new Gson();
//		String json = "[{'userId' : 2 , 'id':2, 'title' : 'test2', 'body' : 'test body2'}]";

		Post[] posts = gson.fromJson(jsonString, Post[].class);
		
		
		/*
		 * Post post = new Post();
		 * post.setUserId(1);
		 * post.setId(1);
		 * post.setTitle("title");
		 * post.setBody("test body");
		 * return post;
		 * */
		
//		System.out.println(post[0].getUserId());
//
//		System.out.println(post[0].getId());
//
//		System.out.println(post[0].getTitle());
//
//		System.out.println(post[0].getBody ());

		for (Post post : posts) {
			
			System.out.println(post.getUserId());
			
			System.out.println(post.getId());
			
			System.out.println(post.getTitle());
			
			System.out.println(post.getBody ());
			System.out.println("##################");

	}
		
		insertIntoDB(posts);
}

	private static void insertIntoDB(Post[]posts)throws Exception{
		/*1. class.forName(...); //JDBC 드라이버 메모리에 적재
		2. Connection con = DriverManager.getConnection(...); //DB서버에 연결
		3. String sql = "insert into posts (userId, id, title,body) values(?,?,?,?);"
				PreparedStatement pstmt = con.prepareStatement(sql);
		
		4. ? 자리에 들어갈 값을 설정한다
			pstmt.setInt(1, post.getUserId());
			pstmt.setInt(2, post.getid());
			pstmt.setString(3, post.getTitle());
			pstmt.setString(4, post.getBody());
			
		5. 서버에 실행요청
			pstmt.executeUpdate();
		6. con.close();
	*/
	
		Class.forName("org.mariadb.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/oop";
		String id = "root";
		String pw = "1111";
		Connection con = DriverManager.getConnection(url,id,pw);
		String sql = "insert into posts(userId, id, title, body) values (?,?,?,?);";
				PreparedStatement pstmt = con.prepareStatement(sql);
		
		for (Post post : posts) {
			pstmt.setInt(1, post.getUserId());
			pstmt.setInt(2, post.getId());
			pstmt.setString(3, post.getTitle());
			pstmt.setString(4, post.getBody());
			pstmt.executeUpdate();
		}		
		con.close();
	}
}
