package URLConnectionReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		
		try {
			URL site = new URL("https://www.naver.com");
			URLConnection url = site.openConnection();
			reader = new BufferedReader(new InputStreamReader(url.getInputStream()));
			
			String line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println();
			reader.close();
		} catch (Exception e) {
			
		}finally {
			try {reader.close();} catch (Exception ignore){}
		}
		
	}

}
