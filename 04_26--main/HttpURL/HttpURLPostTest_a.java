package HttpURL;

import java.net.*;
import java.nio.Buffer;
import java.sql.Date;
import java.io.*;
public class HttpURLPostTest_a {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String site = "http://localhost:9090/todos";
		// localhost
		
		URL url = new URL(site);
		
		HttpURLConnection con = (HttpURLConnection)url.
								openConnection();
		
		con.setDoOutput(true);
		con.setDoOutput(true);
//		con.setRequestMethod("POST");
		con.setRequestProperty("content-type", 
				"application/x-www-form-urlencoded");
		
//		id=scpark &pw=1111
		
		String data = "id=scpark&pw=1111";
//		StringBuffer buffer = new StringBuffer();
//		buffer.append("id=scpark&pw=1111");
//		buffer.append("id=scpark").append("&pw=1111");
//		data = "id=scpark"+"&pw=1111";
		OutputStream ostream = con.getOutputStream();

//		ostream.write(data.getBytes());
//		ostream.flush();
		
//		OutputStream stream = con.getOutputStream();
		
		OutputStreamWriter owriter = new OutputStreamWriter
										(ostream, "UTF-8");
		
		PrintWriter writer = new PrintWriter(owriter);
		writer.print(data);
		writer.flush();
		
		InputStream stream = con.getInputStream();
		
		InputStreamReader streamReader = new InputStreamReader(stream);
		
		BufferedReader reader = new BufferedReader(streamReader);
		String line;
		while((line = reader.readLine())!= null) {
			System.out.println(line);
		} 
		System.out.println();
		
		
	}
}

